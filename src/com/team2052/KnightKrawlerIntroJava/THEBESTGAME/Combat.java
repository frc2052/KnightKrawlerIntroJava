package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

import java.util.Scanner;

public class Combat {

    private int playerHealth;
    private int enemyHealth;
    private Inventory inventory;
    private String input = null;
    private Scanner scanner = null;

    public Combat(Inventory inventory){
        this.inventory = inventory;
        scanner = new Scanner(System.in);
    }

    public int fight(int startingPlayerHealth, Enemies.Enemy enemy){
        playerHealth = startingPlayerHealth;
        enemyHealth = enemy.health;
        while (playerHealth > 0 && enemyHealth > 0){
            System.out.println(enemy.name + " is at " + enemyHealth + " health!");
            System.out.println("What do you want to attack with?");
            inventory.printAttackChoices();
            input = scanner.nextLine();
            System.out.println("player choice (hehe) " + inventory.playerInventory.get(inventory.findAttackChoice(Integer.parseInt(input))).name);
            playerHealth = -1;


        }
        return playerHealth;
    }

    public enum attackTypeEnum{
        STANDARD,
        HEAVY,
        PARRY,
        BASH
    }
}
