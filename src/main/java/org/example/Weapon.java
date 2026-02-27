package org.example;

public enum Weapon {

    SWORD(50, 1.2),
    KNIFE(25, 2.0),
    GUN(100, 0.8);  // Noktalı virgül burada çok önemli

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}