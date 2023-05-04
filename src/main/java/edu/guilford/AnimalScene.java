package edu.guilford;

import java.util.Arrays;

public class AnimalScene 
{
    public static void main( String[] args )
    {
        //Create three cheetas each with random information
        Cheeta cheeta1 = new Cheeta("cheeta", "yellow", 4, 2.5, "meow", false);
        Cheeta cheeta2 = new Cheeta("cheeta", "pink", 2, 279, "hiss", false);
        Cheeta cheeta3 = new Cheeta("cheeta", "orange", 1, 14.7, "moo", false);
        // //Create three snakes each with random information
        Snake snake1 = new Snake("snake", "white", 0, 2.5, "hiss", false);
        Snake snake2 = new Snake("snake", "red", 10, 2.5, "hiss", true);
        Snake snake3 = new Snake("snake", "brown", 3, 2.5, "hiss", false);
        // //Create three crabs each with random information for each field
        Crab crab1 = new Crab("crab", "red", 7, 2.5, "click", false);
        Crab crab2 = new Crab("crab", "red", 8, 2.5, "woof", true);
        Crab crab3 = new Crab("crab", "red", 8, 2.5, "oink", true);
        
        //For Snake
        Snake[] snakes = new Snake[3];
        snakes[0] = snake1;
        snakes[1] = snake2;
        snakes[2] = snake3;
        //print out the array of Snake objects
        System.out.println("\nSnakes:");
        for(int i = 0; i < snakes.length; i++) {
            System.out.println(snakes[i]);
        }
        //Sort the array using the selectionSort
        Snake.selectionSort(snakes);
        System.out.println("\nColor Sort: ");
        //print out the array of Snake objects
        for(int i = 0; i < snakes.length; i++) {
            System.out.println(snakes[i]);
        }

        Animal.sortOrder = Snake.SortOrder.REVERSE;
        Arrays.sort(snakes);
        System.out.println("\nSort Reversed: ");
        //print out the array of Animal objects
        for(int i = 0; i < snakes.length; i++) {
            System.out.println(snakes[i]);
        }

        //For Cheeta
        Cheeta[] cheetas = new Cheeta[3];
        cheetas[0] = cheeta1;
        cheetas[1] = cheeta2;
        cheetas[2] = cheeta3;
        //print out the array of Cheeta objects
        System.out.println("\nCheetas:");
        for(int i = 0; i < cheetas.length; i++) {
            System.out.println(cheetas[i]);
        }
        //Sort the array using the selectionSort
        Cheeta.selectionSort(cheetas);
        System.out.println("\nSound Sort: ");
        //print out the array of Cheeta objects
        for(int i = 0; i < cheetas.length; i++) {
            System.out.println(cheetas[i]);
        }
        Animal.sortOrder = Cheeta.SortOrder.REVERSE;
        Arrays.sort(cheetas);
        System.out.println("\nSort Reversed: ");
        //print out the array of Animal objects
        for(int i = 0; i < cheetas.length; i++) {
            System.out.println(cheetas[i]);
        }

        //For Crab
        Crab[] crabs = new Crab[3];
        crabs[0] = crab1;
        crabs[1] = crab2;
        crabs[2] = crab3;
        //print out the array of Crab objects
        System.out.println("\nCrabs:");
        for(int i = 0; i < crabs.length; i++) {
            System.out.println(crabs[i]);
        }
        //Sort the array using the selectionSort
        Crab.selectionSort(crabs);
        System.out.println("\nSound Sort: ");
        //print out the array of Crab objects
        for(int i = 0; i < crabs.length; i++) {
            System.out.println(crabs[i]);
        }
        Animal.sortOrder = Crab.SortOrder.REVERSE;
        Arrays.sort(crabs);
        System.out.println("\nSort Reversed: ");
        //print out the array of Animal objects
        for(int i = 0; i < crabs.length; i++) {
            System.out.println(crabs[i]);
        }


    }
}
