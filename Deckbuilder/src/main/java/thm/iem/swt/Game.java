package thm.iem.swt;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        boolean continueGame = true;
        char choice;
        Scanner scnr = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Welcome to the SWT Deckbuilder");

        do {
            System.out.println("==============================");
            System.out.println("Start New Game \t [1]");
            System.out.println("Load Save \t\t [2]");
            System.out.println("Quit Game \t\t [3]");
            System.out.println("==============================");
            System.out.print("Choose an option: ");
            choice = scnr.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.println("==============================");
                    System.out.println("Starting New Game ...");
                    // init class-objects and create path object with corresponding encounters
                    // start game loop here
                    break;
                case '2':
                    // load savegame code here
                    break;
                case '3':
                    System.out.println("==============================");
                    System.out.println("Quitting Game ...");
                    continueGame = false;
                    break;
                default:
                    System.out.println("[ERROR] Invalid input, please try again!");
            }
        } while (continueGame);
    }
}