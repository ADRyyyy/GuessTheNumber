import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // cere de la user un nr de la 1 la 100
        // daca nr este mai mic sa se afiseze more
        // daca nr este mai mare sa se afiseze less
        // daca nr este egal  sa se afiseze u won!!
        Scanner scMeu = new Scanner(System.in);
        Random rnd = new Random();


        int hiddenNumber = rnd.nextInt(100);
        int attempts = 0;


        while (true) {

            System.out.println("Guess a number from 1 to 100");
            int guessNumber = scMeu.nextInt();
            attempts++;


            if (guessNumber < hiddenNumber) {
                System.out.println("more");
            } else if (guessNumber > hiddenNumber) {
                System.out.println("less");
            } else {
                System.out.println("You guessed the number!");
                System.out.println("U used" + attempts + "atempts");
                break;
            }
        }
    }
}
// TODO:implementeaza un sistem de vieti(8 vieti-atempts)la a 9 game over si brake
         /*

        while (true) {
            System.out.println("guess the number betwin (1-100)");

            int guessNumber = sc.nextInt();

            if (guessNumber < hidennr) ;
            {
                System.out.println("more");


            } else if {
                (guessNumber > hidennr) ;
            }

                System.out.println("Less");

            } else {
                System.out.println(" U guess the number");
                break;


        }
   }


          */
