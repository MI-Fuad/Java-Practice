package com.company.flowcontrol;
import java.util.Scanner;


//Next step: How do we get the users guess

//What You Should Do
//Class Name: GuessMe
//Create a new class file named GuessMe. -- done
//Write a program that that has an integer of your choice stored in a variable. -- done
//The program asks the user to pick a number. --
//Regardless of the choice, the program should print out what the user entered as part of the response.
// If their choice is equal to the number print out: "Wow, nice guess! That was it!"
// If their choice is less to the number print out: "Ha, nice try - too low! I chose #."
// If their choice is greater to the number print out: "Too bad, way too high. I chose #."
// You're on your own for the code. The example below shows a sample output, but you can change the wording if you wish.
// Write a program that that has an integer of your choice stored in a variable.

//creating a class file names GuessMe
public class GuessMe {

    public static void main(String[] args) {
        //Declaring a variable with int data type
        int x = 12;
        int userInput;

        // declare and initialize a Scanner object - the Scanner reads
        // input from the console
        Scanner myScanner = new Scanner(System.in);

        //Ask the user to guess the number
        System.out.println("Guess a number between 1 and 1000: ");
        // Scanner to pick up input from the user
        // now wait until the user types something in - put the value
        // in userInput
        userInput = myScanner.nextInt();

        if(x == userInput){
            System.out.println("Wow, nice guess! That was it!");
        } else if (userInput < x) {
            System.out.println("Ha, nice try - too low! I chose"+x);
        } else {
            System.out.println("Too bad, way too high. I chose"+x);
        }

    }

}
