import java.util.Scanner;
import java.util.Random;
public class Java1Lesson3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        guessNumber();
    }

    static String guessNumber() {
        Random rnd = new Random();
        int number = rnd.nextInt(10);
        int count = 0;
        int player = 0;
        while (count < 3 && player != number) {
            System.out.println("Enter your number!");
            player = in.nextInt();
            if (player == number)
                System.out.println("You won!");
            else if (player < number)
                System.out.println("Your number is greater");
                else if (player > number)
                    System.out.println("Your number is less");
            count++;
        }
        if (count==3 && player!=number) System.out.println("You lose!");
        String L;
return L = "You lose!";
    }
}


