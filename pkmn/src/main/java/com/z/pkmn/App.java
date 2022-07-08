package com.z.pkmn;


public class App {
    public static void main(String[] args) {
        Trainer trainerA = new Trainer();
        trainerA.setName("A");

        Pokemon pikachu = new Pikachu();
        Squirtle squirtle = new Squirtle();
        while (pikachu.getLifePoints() > 1 && squirtle.getLifePoints() > 1) {
            System.out.println("Pikachu life points: " + pikachu.getLifePoints());
            System.out.println("Squirtle life points: " + squirtle.getLifePoints());
            squirtle.defend(pikachu.attack());
            pikachu.defend(squirtle.attack());
        }


    }
}
