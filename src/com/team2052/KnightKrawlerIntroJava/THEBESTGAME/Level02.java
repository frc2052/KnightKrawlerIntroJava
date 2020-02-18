package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

import com.team2052.KnightKrawlerIntroJava.THEBESTGAME.Inventory;

public class Level02 {
    private Inventory playerInventory;
    private Inventory enemyInventory = new Inventory();

    public Level02(Inventory m_inventory){
        playerInventory = m_inventory;
    }

    public void play(){
        playerInventory.listInventory();
    }


}
