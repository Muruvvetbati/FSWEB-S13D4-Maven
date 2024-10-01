package org.example;

public enum Weapon {
    SWORD(30,5),
    AXE(20,5),
    MACE(10,2);
    private int damage;
    private double attackSpeed;
    Weapon(int damage,double attackSpeed){

        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage(){
        return  this.damage;
    }
    public double getAttackSpeed(){
        return this.attackSpeed;
    }
}
