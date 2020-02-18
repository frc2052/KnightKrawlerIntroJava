package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<InventoryParameters> inventory = new ArrayList<>();

    public void addItem(String itemName, ItemTypeEnum itemType, int itemDurability, double itemDropPercent, int itemDamage, int itemDamage2, int itemDefense) {
        InventoryParameters equipment = new InventoryParameters();
        equipment.name = itemName;
        equipment.type = itemType;
        equipment.durability = itemDurability;
        equipment.dropPercent = itemDropPercent;
        equipment.damage1 = itemDamage;
        equipment.damage2 = itemDamage2;
        equipment.defense = itemDefense;
        inventory.add(equipment);
    }

    public void listInventory() {
        if (inventory.size() == 0){
            System.out.println("you have nothing in your inventory");
        } else {
            System.out.println("Inventory:");
            for (int i = 0; i < inventory.size(); i++) {
                InventoryParameters item = inventory.get(i);
                System.out.println(item.name);
                System.out.println("Durability: " + item.durability);
                if (item.type == ItemTypeEnum.ARMOR) {
                    System.out.println("Defense: " + item.defense);
                } else if (item.type == ItemTypeEnum.WEAPON) {
                    System.out.println("Standard Damage: " + item.damage1);
                    System.out.println("Heavy Damage: " + item.damage2);
                } else if (item.type == ItemTypeEnum.SHIELD) {
                    System.out.println("Damage: " + item.damage1);
                    System.out.println("Defense: " + item.defense);
                }
            }
        }
    }
    public void listWeapons(){
        if(inventory.size() == 0){
            System.out.println("you have nothing in your inventory");
        } else {
            System.out.println("Weapons: ");
            for(int i = 0; i < inventory.size(); i++){
                InventoryParameters item = inventory.get(i);
                if(item.type == ItemTypeEnum.WEAPON){
                    System.out.println(item.name);
                    System.out.println("Standard Damage: " + item.damage1);
                    System.out.println("Heavy Damage: " + item.damage2);
                }
            }
        }
    }
    public ArrayList<InventoryParameters> getInventoryObject(){
        return inventory;
    }

    public void clearInventory(){
        inventory.clear();
    }



    public class InventoryParameters{
        public String name;
        public ItemTypeEnum type;
        public int durability;
        public double dropPercent;
        public int damage1;
        public int damage2;
        public int defense;
    }

    public enum ItemTypeEnum{
        ARMOR,
        WEAPON,
        KEY,
        OBJECT,
        SHIELD
    }
}
