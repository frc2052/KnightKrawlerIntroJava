package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

import java.util.Scanner;

public class Level02 {
    private Inventory playerInventory;
    private Combat combat;
    private Scanner scanner = null;
    private Enemies enemies;
    private boolean playAgain = true;
    private int currentPos = 0;
    private String move = null;
    private int playerHealth = 100;


    public Level02(Inventory m_inventory){
        playerInventory = m_inventory;
        combat = new Combat(playerInventory);
        scanner = new Scanner(System.in);
        enemies = new Enemies();
    }

    public void play(){
        playAgain = true;
        while(playAgain) {
            reset();
            while(playerHealth >= 0) {
                playerInventory.addItem("HeHe", Inventory.ItemTypeEnum.WEAPON, 10000000, 100, 10, 20, 0);
                playerInventory.addItem("hehe2", Inventory.ItemTypeEnum.SHIELD, 10000000, 100, 4, 0, 5);
                playerInventory.addItem("HEHE3", Inventory.ItemTypeEnum.ARMOR, 10000000, 100, 0, 0, 10);
                System.out.println("You Have encountered a " + enemies.enemies[enemies.findEnemy("little Orc")].name);
                playerHealth = combat.fight(playerHealth, enemies.enemies[enemies.findEnemy("little Orc")]);
            }
            System.out.println("do you want to play again?");
            System.out.println("\"Y\" or \"N\"");
            move = scanner.nextLine();
            if (move.toLowerCase().trim().equals("y")){
                currentPos = 1;
            } else if (move.toLowerCase().trim().equals("n")){
                playAgain = false;
            }
        }



    }

    private void reset(){
        currentPos = 0;

    }


}
