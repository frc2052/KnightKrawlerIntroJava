package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

public class Level02 {
    private Inventory playerInventory;
    private Combat combat;

    public Level02(Inventory m_inventory){
        playerInventory = m_inventory;
         combat = new Combat(playerInventory);
    }

    public void play(){
        playerInventory.listInventory();
        

    }


}
