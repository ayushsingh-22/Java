import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxNumber = 10;
        int randNo = (int) (Math.random() * maxNumber);
        System.out.println("Random Number => " + randNo); // For testing; remove this in real use

        System.out.println("Hello User....");
        System.out.println("Guess a number between 0 and " + (maxNumber - 1));

        int userInput;

        // Loop until the user guesses correctly
        while (true) {
            System.out.print("Enter your guess: ");
            userInput = sc.nextInt();

            if (userInput == randNo) {
                System.out.println("🎉 You guessed it right! You win!");
                break;
            } else if (userInput < randNo) {
                System.out.println("Try a bigger number 🔼");
            } else {
                System.out.println("Try a smaller number 🔽");
            }
        }

        sc.close(); // Always close your scanner
    }
}
