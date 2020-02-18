package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

public class Combat {

    private int playerHealth;
    private int enemyHealth;
    private Inventory inventory;

    public Combat(Inventory inventory){
        this.inventory = inventory;
    }

    public int fight(int startingPlayerHealth, String enemyName, int startingEnemyHealth, int eDamage){
        playerHealth = startingPlayerHealth;
        enemyHealth = startingEnemyHealth;
        while (playerHealth > 0 && enemyHealth > 0){

        }
        return playerHealth;
    }
}
