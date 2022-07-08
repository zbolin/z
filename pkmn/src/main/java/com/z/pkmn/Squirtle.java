package com.z.pkmn;

public class Squirtle extends Pokemon {
    private static final int MIN_HEALTH = 70;
    private static final int MAX_HEALTH = 100;
    private static final int AVOID_DMG_CHANCE = 2;

    @Override
    public String getNickname() {
        return "Squirtle";
    }

    @Override
    public int getAvoidDamageChance() {
        return AVOID_DMG_CHANCE;
    }

    @Override
    public int getMinHealth() {
        return MIN_HEALTH;
    }

    @Override
    public int getMaxHealth() {
        return MAX_HEALTH;
    }
}
