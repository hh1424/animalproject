package edu.guilford;

import java.util.Arrays;

public class AnimalScene 
{
    public static void main( String[] args )
    {
        //Create three cheetas each with random information
        // Cheeta cheeta1 = new Cheeta("cheeta", "yellow", 4, 2.5, "meow", false);
        // Cheeta cheeta2 = new Cheeta("cheeta", "pink", 2, 279, "hiss", false);
        // Cheeta cheeta3 = new Cheeta("cheeta", "orange", 1, 14.7, "moo", false);
        // //Create three snakes each with random information
        // Snake snake1 = new Snake("snake", "white", 0, 2.5, "hiss", false);
        // Snake snake2 = new Snake("snake", "red", 0, 2.5, "hiss", false);
        // Snake snake3 = new Snake("snake", "brown", 0, 2.5, "hiss", false);
        // //Create three crabs each with random information for each field
        // Crab crab1 = new Crab("crab", "red", 8, 2.5, "click", false);
        // Crab crab2 = new Crab("crab", "blue", 8, 2.5, "click", true);
        // Crab crab3 = new Crab("crab", "black", 8, 2.5, "click", true);
        
        //For Snake
        Snake[] snakes = new Snake[5];
        for(int i = 0; i < snakes.length; i++) {
            snakes[i] = new Snake();
        }
        //print out the array of Snake objects
        for(int i = 0; i < snakes.length; i++) {
            System.out.println(snakes[i]);
        }
        //Sort the array using the selectionSort
        Snake.selectionSort(snakes);
        System.out.println("\nAfter sorting (Snakes): ");
        //print out the array of Snake objects
        for(int i = 0; i < snakes.length; i++) {
            System.out.println(snakes[i]);
        }

        // Animal.sortOrder = Animal.SortOrder.REVERSE;
        // Arrays.sort(snakes);
        // System.out.println("\nSort Reversed: ");
        // //print out the array of Animal objects
        // for(int i = 0; i < snakes.length; i++) {
        //     System.out.println(snakes[i]);
        // }

        //For Cheeta
        Cheeta[] cheetas = new Cheeta[5];
        for(int i = 0; i < cheetas.length; i++) {
            cheetas[i] = new Cheeta();
        }
        //print out the array of Cheeta objects
        for(int i = 0; i < cheetas.length; i++) {
            System.out.println(cheetas[i]);
        }
        //Sort the array using the selectionSort
        Cheeta.selectionSort(cheetas);
        System.out.println("\nAfter sorting (Cheetas): ");
        //print out the array of Cheeta objects
        for(int i = 0; i < cheetas.length; i++) {
            System.out.println(cheetas[i]);
        }

        //For Crab
        Crab[] crabs = new Crab[5];
        for(int i = 0; i < crabs.length; i++) {
            crabs[i] = new Crab();
        }
        //print out the array of Crab objects
        for(int i = 0; i < crabs.length; i++) {
            System.out.println(crabs[i]);
        }
        //Sort the array using the selectionSort
        Crab.selectionSort(crabs);
        System.out.println("\nAfter sorting (Crabs): ");
        //print out the array of Crab objects
        for(int i = 0; i < crabs.length; i++) {
            System.out.println(crabs[i]);
        }


    }
}
