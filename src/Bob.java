import java.util.Scanner;

public class Bob {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        boolean bobStillSpeaks = true;

        do {

            System.out.println("Begin conversation attempt.");

            String userInput = scanner.nextLine();

            if(userInput.isEmpty()){

                System.out.println(" BOB: 'Fine. Be that way!' ");

            } else if (userInput.endsWith("?")) {

                System.out.println("BOB: 'Sure.' ");

            } else if (userInput.endsWith("!")) {

                System.out.println("BOB: 'Whoa, chill out!' ");

            } else if (userInput.endsWith(".")) {

                System.out.println("BOB: 'Whatever.' ");

            } else if (userInput.equalsIgnoreCase("Bye")) {

                System.out.println("BOB: 'Later.' ");

                bobStillSpeaks = false;

            }
        } while(bobStillSpeaks);

        System.out.println("Bob walks off.");



    }
}
