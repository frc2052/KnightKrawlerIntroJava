package com.team2052.KnightKrawlerIntroJava.THEBESTGAME;

public class Enemies {

    public Enemy[] enemies = new Enemy[2];


    public Enemies(){
        Enemy littleOrc = new Enemy();
        littleOrc.name = "little Orc";
        littleOrc.health = 30;
        littleOrc.standardDamage = 2;
        littleOrc.heavyDamage = 3;
        littleOrc.bashDamage = 1;
        enemies[1] = littleOrc;

        Enemy HEHEHEHEHEHEHEHE = new Enemy();
        HEHEHEHEHEHEHEHE.name = "HEHEHEHEHEHEHEHEHEHEHEHEHEHE";
        enemies[0] = HEHEHEHEHEHEHEHE;
    }

    public int findEnemy(String enemy){
        for (int i = 0; i < enemies.length; i++){
            if (enemy.equals(enemies[i].name)){
                return i;
            }
        }
        return 0;
    }


    public class Enemy{
        public String name;
        public int health;
        public int standardDamage;
        public int heavyDamage;
        public int bashDamage;

    }
}
