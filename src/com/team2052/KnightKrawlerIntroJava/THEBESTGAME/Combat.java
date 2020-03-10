package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

import java.util.Scanner;
import java.util.Random;

public class Combat {

    private int playerHealth;
    private int enemyHealth;
    private Inventory inventory;
    private String input = null;
    private Scanner scanner = null;
    private Random random = null;
    private attackTypeEnum playerAttackType;
    private attackTypeEnum enemyAttackType;

    public Combat(Inventory inventory){
        this.inventory = inventory;
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public int fight(int startingPlayerHealth, Enemies.Enemy enemy){
        playerHealth = startingPlayerHealth;
        enemyHealth = enemy.health;
        while (playerHealth > 0 && enemyHealth > 0){
            int attackChoicePosInt = 0;
            System.out.println(enemy.name + " is at " + enemyHealth + " health!");
            System.out.println("You are at " + playerHealth + " health!");
            if (playerAttackType != attackTypeEnum.STUNNED) {
                inventory.printAttackChoices();
                input = scanner.nextLine();
                attackChoicePosInt = inventory.findAttackChoice(Integer.parseInt(input));
                System.out.println("you chose to attack with your " + inventory.playerInventory.get(attackChoicePosInt).name);
                setPlayerAttackType(inventory.playerInventory.get(attackChoicePosInt).type);
                System.out.println("You used  " + playerAttackType + "!");
            }
            if (enemyAttackType != attackTypeEnum.STUNNED){
                setEnemyAttackType();
                System.out.println("Enemy used " + enemyAttackType);
            }
            doDamage(attackChoicePosInt, enemy);
            if (enemyAttackType == attackTypeEnum.STUNNED){
                System.out.println("Enemy is stunned!");
            }
            if (playerAttackType == attackTypeEnum.STUNNED){
                System.out.println("You are stunned!");
            }
        }
        return playerHealth;
    }

    private void setPlayerAttackType(Inventory.ItemTypeEnum type){

        if (type == Inventory.ItemTypeEnum.WEAPON){
            System.out.println("1 -> Standard Attack");
            System.out.println("2 -> Heavy Attack");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 1){
                playerAttackType = attackTypeEnum.STANDARD_ATTACK;
            } else if (input == 2){
                playerAttackType = attackTypeEnum.HEAVY_ATTACK;
            }
        } else if (type == Inventory.ItemTypeEnum.SHIELD){
            System.out.println("1 -> block/parry");
            System.out.println("2 -> Shield bash");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 1){
                playerAttackType = attackTypeEnum.PARRY;
            } else if (input == 2){
                playerAttackType = attackTypeEnum.SHIELD_BASH;
            }
        }
    }
    private void setEnemyAttackType(){
        double enemyDouble = random.nextDouble();
        if (enemyDouble <= 0.25){
            enemyAttackType = attackTypeEnum.STANDARD_ATTACK;
        } else if (enemyDouble > 0.25 && enemyDouble <= 0.5){
            enemyAttackType = attackTypeEnum.HEAVY_ATTACK;
        } else if (enemyDouble > 0.5 && enemyDouble < 0.75){
            enemyAttackType = attackTypeEnum.PARRY;
        } else if (enemyDouble >= 0.75){
            enemyAttackType = attackTypeEnum.SHIELD_BASH;
        }
    }
    private void doDamage(int playerChoice, Enemies.Enemy enemy){
        System.out.println("player: " + playerAttackType + " Enemy: " + enemyAttackType);
        //player = standard, enemy = standard
        if (playerAttackType == attackTypeEnum.STANDARD_ATTACK && enemyAttackType == attackTypeEnum.STANDARD_ATTACK){
            damageEnemy(inventory.playerInventory.get(playerChoice).standardDamage);
            damagePlayer(enemy.standardDamage);
        }
        //player = standard, enemy = bash or heavy
        else if (playerAttackType == attackTypeEnum.STANDARD_ATTACK && enemyAttackType == attackTypeEnum.SHIELD_BASH || enemyAttackType == attackTypeEnum.HEAVY_ATTACK) {
            damageEnemy(inventory.playerInventory.get(playerChoice).standardDamage);
        }
        //player = standard, enemy = parry
        else if (playerAttackType == attackTypeEnum.STANDARD_ATTACK && enemyAttackType == attackTypeEnum.PARRY) {
            damagePlayer(enemy.standardDamage);
        }
        //player = heavy, enemy = standard
        else if (playerAttackType == attackTypeEnum.HEAVY_ATTACK && enemyAttackType == attackTypeEnum.STANDARD_ATTACK){
            damagePlayer(enemy.standardDamage);
        }
        //player = heavy, enemy = heavy
        else if (playerAttackType == attackTypeEnum.HEAVY_ATTACK && enemyAttackType == attackTypeEnum.HEAVY_ATTACK) {
            damagePlayer(enemy.heavyDamage);
            damageEnemy(inventory.playerInventory.get(playerChoice).heavyDamage);
        }
        //player = heavy, enemy = parry
        else if (playerAttackType == attackTypeEnum.HEAVY_ATTACK && enemyAttackType == attackTypeEnum.PARRY) {
            damageEnemy(inventory.playerInventory.get(playerChoice).heavyDamage);
        }
        //player = heavy, enemy = bash
        else if (playerAttackType == attackTypeEnum.HEAVY_ATTACK && enemyAttackType == attackTypeEnum.SHIELD_BASH) {
            damagePlayer(enemy.bashDamage);
            playerAttackType = attackTypeEnum.STUNNED;
        }
        //player = parry, enemy = standard or bash
        else if (playerAttackType == attackTypeEnum.PARRY && enemyAttackType == attackTypeEnum.STANDARD_ATTACK || enemyAttackType == attackTypeEnum.SHIELD_BASH){
            damageEnemy(inventory.playerInventory.get(playerChoice).standardDamage);
        }
        //player = parry, enemy = heavy
        else if (playerAttackType == attackTypeEnum.PARRY && enemyAttackType == attackTypeEnum.HEAVY_ATTACK) {
            damagePlayer(enemy.heavyDamage);
        }
        //player = parry, enemy = parry
        else if (playerAttackType == attackTypeEnum.PARRY && enemyAttackType == attackTypeEnum.PARRY) {
            System.out.println("you both parried! Nothing happened");
        }
        //player = bash, enemy = standard
        else if (playerAttackType == attackTypeEnum.SHIELD_BASH && enemyAttackType == attackTypeEnum.STANDARD_ATTACK){
            damagePlayer(enemy.standardDamage);
        }
        //player = bash, enemy = heavy
        else if (playerAttackType == attackTypeEnum.SHIELD_BASH && enemyAttackType == attackTypeEnum.HEAVY_ATTACK) {
            damageEnemy(inventory.playerInventory.get(playerChoice).heavyDamage);
            enemyAttackType = attackTypeEnum.STUNNED;
        }
        //player = bash, enemy = parry
        else if (playerAttackType == attackTypeEnum.SHIELD_BASH && enemyAttackType == attackTypeEnum.PARRY) {
            damagePlayer(enemy.standardDamage);
        }
        //player = bash, enemy = bash
        else if (playerAttackType == attackTypeEnum.SHIELD_BASH && enemyAttackType == attackTypeEnum.SHIELD_BASH) {
            damagePlayer(enemy.bashDamage);
            damageEnemy(inventory.playerInventory.get(playerChoice).heavyDamage);
        }
    }
    private void damagePlayer(int damage){
        playerHealth = playerHealth - damage;
    }
    private void damageEnemy(int damage){
        enemyHealth = enemyHealth - damage;
    }
    public enum attackTypeEnum{
        STANDARD_ATTACK,
        HEAVY_ATTACK,
        PARRY,
        SHIELD_BASH,
        STUNNED
    }
}
