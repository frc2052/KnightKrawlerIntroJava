package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

import java.util.Scanner;

public class Combat {

    private int playerHealth;
    private int enemyHealth;
    private Inventory inventory;
    private String input = null;
    private Scanner scanner = null;
    private attackTypeEnum playerAttackType;

    public Combat(Inventory inventory){
        this.inventory = inventory;
        scanner = new Scanner(System.in);
    }

    public int fight(int startingPlayerHealth, Enemies.Enemy enemy){
        playerHealth = startingPlayerHealth;
        enemyHealth = enemy.health;
        while (playerHealth > 0 && enemyHealth > 0){
            System.out.println(enemy.name + " is at " + enemyHealth + " health!");
            inventory.printAttackChoices();
            input = scanner.nextLine();
            int attackChoicePosInt = inventory.findAttackChoice(Integer.parseInt(input));
            System.out.println("player choice (hehe) " + inventory.playerInventory.get(attackChoicePosInt).name);
            setPlayerAttackType(inventory.playerInventory.get(attackChoicePosInt).type);
            System.out.println("player attack choice " + playerAttackType);
            doDamage(attackChoicePosInt);
        }
        return playerHealth;
    }

    public void setPlayerAttackType(Inventory.ItemTypeEnum type){

        if (type == Inventory.ItemTypeEnum.WEAPON){
            System.out.println("1 -> Standard Attack");
            System.out.println("2 -> Heavy Attack");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 1){
                playerAttackType = attackTypeEnum.STANDARD;
            } else if (input == 2){
                playerAttackType = attackTypeEnum.HEAVY;
            }
        } else if (type == Inventory.ItemTypeEnum.SHIELD){
            System.out.println("1 -> block/parry");
            System.out.println("2 -> Shield bash");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 1){
                playerAttackType = attackTypeEnum.PARRY;
            } else if (input == 2){
                playerAttackType = attackTypeEnum.BASH;
            }
        }
    }
    public void doDamage(int playerChoice){
        if (playerAttackType == attackTypeEnum.STANDARD){
            enemyHealth = enemyHealth - inventory.playerInventory.get(playerChoice).damage1;
        } else if (playerAttackType == attackTypeEnum.HEAVY){
            enemyHealth = enemyHealth - inventory.playerInventory.get(playerChoice).damage2;
        } else if (playerAttackType == attackTypeEnum.PARRY){
            enemyHealth = enemyHealth - inventory.playerInventory.get(playerChoice).damage2;
        } else if (playerAttackType == attackTypeEnum.BASH){
            enemyHealth = enemyHealth - inventory.playerInventory.get(playerChoice).damage1;
        }
    }

    public enum attackTypeEnum{
        STANDARD,
        HEAVY,
        PARRY,
        BASH
    }
}
