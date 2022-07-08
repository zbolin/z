package com.z.pkmn;

import java.util.Random;

public abstract class Pokemon {

    private static final double ATTACK_MULTIPLIER = 1.0;
    private static final int AVOID_DMG_CHANCE = 3;
    private static final int MIN_HEALTH = 50;
    private static final int MAX_HEALTH = 100;
    private static final int MIN_ATTACK_DMG = 25;
    private static final int MAX_ATTACK_DMG = 40;
    private int lifePoints;

    public abstract String getNickname();

    public Pokemon() {
        Random r = new Random();
        int low = getMinHealth();
        int high = getMaxHealth();
        int result = r.nextInt(high - low) + low;
        lifePoints = result;
    }

    public double attack() {
        Random r = new Random();
        int low = getMinAttackDamage();
        int high = getMaxAttackDamage();
        int result = r.nextInt(high - low) + low;
        double attackValue = result * getAttackMultiplier();
        System.out.println(getNickname() + " attacking with " + attackValue + " points.");
        return attackValue;
    }

    public void defend(double attackValue) {

        Random r = new Random();
        int low = 0;
        int high = getAvoidDamageChance();
        int result = r.nextInt(high - low) + low;
        if (result == 0) {
            System.out.println(getNickname() + " dodged the attack.");
        }
        lifePoints -= attackValue;
        System.out.println(getNickname() + " took " + attackValue + " damange. Health is now " + lifePoints);
        if (lifePoints < 1) {
            System.out.println(getNickname() + " fainted.");
        }

    }

    public double getAttackMultiplier() {
        return ATTACK_MULTIPLIER;
    }

    public int getAvoidDamageChance() {
        return AVOID_DMG_CHANCE;
    }

    public int getMinHealth() {
        return MIN_HEALTH;
    }

    public int getMaxHealth() {
        return MAX_HEALTH;
    }

    public int getMinAttackDamage() {
        return MIN_ATTACK_DMG;
    }

    public int getMaxAttackDamage() {
        return MAX_ATTACK_DMG;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }


}
