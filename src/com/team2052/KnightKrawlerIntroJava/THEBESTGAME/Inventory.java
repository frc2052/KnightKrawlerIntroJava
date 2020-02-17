package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<InventoryParameters> inventory = new ArrayList<>();

    public void addItem(String itemName, ItemTypeEnum itemType, int itemDurability, double itemDropPercent, int itemDamage, int itemDefense) {
        InventoryParameters equipment = new InventoryParameters();
        equipment.name = itemName;
        equipment.type = itemType;
        equipment.durability = itemDurability;
        equipment.dropPercent = itemDropPercent;
        equipment.damage = itemDamage;
        equipment.defense = itemDefense;
        inventory.add(equipment);
    }

    public void listInventory() {
        System.out.println("Inventory:");
        for (int i = 0; i < inventory.size(); i++) {
            InventoryParameters item = inventory.get(i);
            System.out.println(item.name);
            System.out.println("Durability: " + item.durability);
            if (item.type == ItemTypeEnum.ARMOR || item.type == ItemTypeEnum.SHIELD) {
                System.out.println("Defense: " + item.defense);
            } else if (item.type == ItemTypeEnum.WEAPON || item.type == ItemTypeEnum.SHIELD) {
                System.out.println("Damage: " + item.damage);
            }
        }
    }



    public class InventoryParameters{
        public String name;
        public ItemTypeEnum type;
        public int durability;
        public double dropPercent;
        public int damage;
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
