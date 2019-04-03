import java.util.Scanner;

public class MethodsExercises {

    public static int addition(int x, int y){
        return x + y;
    }


    public static Scanner scanner = new Scanner(System.in);

    public static int getInteger(int min, int max){

        System.out.println("Enter a number between " + min + " and " + max);

        int userInput = scanner.nextInt();

        while(userInput < min || userInput > max) {

            System.out.printf("Your number is out of range. Please enter a number between %s and %s\n", min, max);

            userInput = scanner.nextInt();
            }

        System.out.println("You entered a valid number!");

        return  userInput;

    }

/*
    static void factorial(int i){

        boolean userContinue = false;

        do {
            long fact = 1;

            for (int x = 1; x <= i; x += 1) {
                fact *= x;
                System.out.println(fact);
            }

            System.out.println("Factorial of " + i + " is: " + fact);

            System.out.println("Would you like to continue?");

            String userAnswer= scanner.next();

            if(userAnswer.equalsIgnoreCase("y") || (userAnswer.equalsIgnoreCase("yes"))){
                System.out.println("Enter another number.");
                i = scanner.nextInt();

            }

        } while (userContinue);


    }*/

    public static long calculateFactorial(int arg) {
        long output = 1;
        for (int i = 1; i <= arg; i += 1) {
            output *= i;
        }
        return output;
    }

    public static void processFactorial() {
        boolean willContinue;
        do {
            System.out.println("Enter a number between 1 and 10");
            Scanner sc = new Scanner(System.in);
            int userInt = getInteger(1, 10);
            System.out.println("The factorial is: " + calculateFactorial(userInt));
            System.out.println("Do you wish to enter another number to calculate?");
            willContinue = sc.next().equals("y");
        } while(willContinue);
        System.out.println("Have a nice day!");
    }



/*

Exercise 4

    Create an application that simulates dice rolling.

    Ask the user to enter the number of sides for a pair of dice.
    Prompt the user to roll the dice.
"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
            Use static methods to implement the method(s) that generate the random numbers.
    Use the .random method of the java.lang.Math class to generate random numbers.

    */

    public static int randomizerOne(){
        int one = (int) Math.round(Math.floor(Math.random() * 6 + 1));
        return one;

    }

/*    public static int randomizerTwo(){
        int two = (int) Math.round(Math.floor(Math.random() * 6 + 1));
        return two;

    }

    public static void diceRoll(randomizerOne(), int randomizerTwo()){
        System.out.println("Enter the number of sides for a PAIR of dice.");

        int userInput = scanner.nextInt();

        System.out.println("Roll the dice!");


        randomizerOne() = scanner.nextInt();

        System.out.println(randomizerOne());

        int randomizerTwo() = scanner.nextInt();

        System.out.println(randomizerTwo());

    }*/


    public static void main(String[] args) {


/*        System.out.println(addition(5, 7));


        int userInput = getInteger(5, 15);*/
/*

        int i = getInteger(1, 10);
       processFactorial();*/





    }

}
