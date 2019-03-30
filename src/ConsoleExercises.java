import java.util.Scanner;


public class ConsoleExercises {


    public static void main(String[] args) {

        double pi = 3.14159;

        System.out.println(pi);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");


        int userInput = sc.nextInt();
        System.out.println(userInput);


        System.out.println("Enter a sentence.");

        String userInputTwo = sc.next();

        System.out.println(userInputTwo);




    }


}
