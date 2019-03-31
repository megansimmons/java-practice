import java.util.Scanner;


public class ConsoleExercises {


    public static void main(String[] args) {

        double pi = 3.14159;

        System.out.println(pi);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");


        int userInput = sc.nextInt();
        System.out.println(userInput);

        System.out.println("Enter three words.");

        String wordOne = sc.next();
        String wordTwo = sc.next();
        String wordThree  = sc.next();

        sc.nextLine();//this is the buffer to keep program from skipping over sentence input.

        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);



        System.out.println("Enter a sentence.");

        String userInputTwo = sc.nextLine();


        System.out.println(userInputTwo);

        System.out.println("Enter the length and width of your classroom.");

        double inputLength = sc.nextDouble();
        double inputWidth = sc.nextDouble();
        double area = inputLength * inputWidth;
        double perimeter = 2 * inputLength + 2 * inputWidth;

        System.out.printf("The perimeter of the classroom is: %s\n", perimeter);
        System.out.printf("The area of the classroom is: %s", area );



    }


}
