import java.util.Scanner;

public class ControlFLowExercises {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


/*        int i = 5;

        while(i <= 15){
            System.out.println(i);
            i++;

        }*/


   /*     int x = 0;

        do {
            x = x + 2;
            System.out.println(x);

        } while(x < 100);*/


        /*int m = 100;

        do {
            System.out.println(m);
            m -= 5;

        } while(m >= -10);*/





/*        for(int m = 100; m >= -10; m -=1) {
            if (m % 5 == 0) {
                System.out.println(m);
            }

        }*/


        /*long a = 2;

        do {

            System.out.println(a);
            a *= a;

        } while(a < 1000000);
*/


/*        for(long a = 2; a < 1000000; a *=a){
            System.out.println(a);

        }*/


        /*for (int r = 1; r <= 20; r += 1) {
            if(r % 3 == 0 && r % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(r % 3 == 0) {
                System.out.println("Fizz");
            } else if (r % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(r);
            }

        }*/

        System.out.println("Enter an integer.");

        int userInt = scanner.nextInt();

        System.out.println(userInt);

        System.out.println("Here is your table!");

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for(int c = 1; c <= userInt; c += 1){
            System.out.println(c);
            System.out.println();
            System.out.println(c);
            c = (int)(java.lang.Math.pow(c, 3));
        }




    }


}
