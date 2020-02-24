package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

import java.util.ArrayList;

public class Inventory {

    public ArrayList<InventoryParameters> playerInventory = new ArrayList<>();

    public void addItem(String itemName, ItemTypeEnum itemType, int itemDurability, double itemDropPercent, int itemDamage, int itemDamage2,int itemDefense) {
        InventoryParameters equipment = new InventoryParameters();
        equipment.name = itemName;
        equipment.type = itemType;
        equipment.durability = itemDurability;
        equipment.dropPercent = itemDropPercent;
        equipment.damage1 = itemDamage;
        equipment.damage2 = itemDamage2;
        equipment.defense = itemDefense;
        playerInventory.add(equipment);
    }

    public void listInventory() {
        if (playerInventory.size() == 0){
            System.out.println("you have nothing in your playerInventory");
        } else {
            System.out.println("Inventory:");
            for (int i = 0; i < playerInventory.size(); i++) {
                InventoryParameters item = playerInventory.get(i);
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
    public void listType(ItemTypeEnum itemType){
        if(playerInventory.size() == 0){
            System.out.println("you have nothing in your playerInventory");
        } else {
            if (itemType == ItemTypeEnum.WEAPON) {
                System.out.println("Weapons: ");
            } else if (itemType == ItemTypeEnum.ARMOR){
                System.out.println("Armor: ");
            } else if (itemType == ItemTypeEnum.SHIELD){
                System.out.println("Shields: ");
            }
            for(int i = 0; i < playerInventory.size(); i++){
                InventoryParameters item = playerInventory.get(i);
                if(item.type == itemType){
                    System.out.println(item.name);
                    System.out.println("Durability: " + item.durability);
                    if(itemType == ItemTypeEnum.WEAPON) {
                        System.out.println("Standard Damage: " + item.damage1);
                        System.out.println("Heavy Damage: " + item.damage2);
                    } else if (itemType == ItemTypeEnum.SHIELD){
                        System.out.println("Defense: " + item.defense);
                        System.out.println("Bash Damage: " + item.damage1);
                    } else if (itemType == ItemTypeEnum.ARMOR){
                        System.out.println("Defense: " + item.defense);
                    }
                }
            }
        }
    }

    public void printAttackChoices(){
        System.out.println("What do you want to attack with?");
        int itemNumber = 1;
        listType(ItemTypeEnum.WEAPON);
        listType(ItemTypeEnum.SHIELD);
        for (int i = 0; i < playerInventory.size(); i++){
            InventoryParameters item = playerInventory.get(i);
            if (item.type == ItemTypeEnum.WEAPON || item.type == ItemTypeEnum.SHIELD){
                System.out.println(itemNumber + " -> " + item.name);
                itemNumber = itemNumber + 1;
            }
        }
    }
    public int findAttackChoice(int input){
        int itemNumber = 1;
        for (int i = 0; i < playerInventory.size(); i++){
            InventoryParameters item = playerInventory.get(i);
            if (item.type == ItemTypeEnum.WEAPON || item.type == ItemTypeEnum.SHIELD){
                if(itemNumber == input){
                    System.out.println("player choice  -> " + item.name);
                    return i;
                }
                itemNumber = itemNumber + 1;
            }
        }
        return 0;
    }
    public ArrayList<InventoryParameters> getInventoryObject(){
        return playerInventory;
    }

    public void clearInventory(){
        playerInventory.clear();
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
