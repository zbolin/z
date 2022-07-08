package com.z.pkmn;

import java.util.Random;

/**
 * * 4. Pikachu attributes and behavior
 * * a. It has a 25% chance of increasing attack
 * * damage by 50%
 */
public class Pikachu extends Pokemon {
    private static double ATTACK_INCREASE = 0.5;

    @Override
    public String getNickname() {
        return "Pika";
    }

    @Override
    public double getAttackMultiplier() {
        Random r = new Random();
        int low = 0;
        int high = 3;
        int result = r.nextInt(high - low) + low;
        if (result == 0) {
            return super.getAttackMultiplier() + ATTACK_INCREASE;
        }
        return super.getAttackMultiplier();
    }
}
