/* 
import java.util.*;

public class codsoft 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) 
        {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;

            System.out.println("Round " + (rounds + 1));
            System.out.println("Guess the number between " + lowerBound + " and " + upperBound);

            while (attempts < maxAttempts) 
            {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess < lowerBound || userGuess > upperBound) 
                {
                    System.out.println("Please enter a number within the specified range.");
                } 
                else if (userGuess < targetNumber) 
                {
                    System.out.println("Too low! Try again.");
                } 
                else if (userGuess > targetNumber) 
                {
                    System.out.println("Too high! Try again.");
                } 
                else 
                {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    break;
                }
            }

            rounds++;
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next().toLowerCase();
            
            if (!playAgain.equals("yes")) 
            {
                System.out.println("Thanks for playing! Your total score is: " + score + " rounds won.");
                break;
            }
        }

        sc.close();
    }
}
*/


/* 
import java.util.Scanner;

public class codsoft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;
        int numSubjects;
        double averagePercentage;
        String grade = "";
  
        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        averagePercentage = (double) totalMarks / numSubjects;

        if (averagePercentage >= 90) 
        {
            grade = "A+";
        } 
        else if (averagePercentage >= 80) 
        {
            grade = "A";
        } 
        else if (averagePercentage >= 70) 
        {
            grade = "B";
        } 
        else if (averagePercentage >= 60) 
        {
            grade = "C";
        } 
        else if (averagePercentage >= 50) 
        {
            grade = "D";
        } 
        else 
        {
            grade = "F";
        }
      
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
*/

import java.util.Scanner;

// BankAccount class to represent the user's bank account
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

// ATM class to represent the ATM machine
class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount account) {
        this.userAccount = account;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public void checkBalance() {
        double balance = userAccount.getBalance();
        System.out.println("Your account balance is: $" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            userAccount.deposit(amount);
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (userAccount.withdraw(amount)) {
                System.out.println("$" + amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient funds. Withdrawal failed.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class codsoft {
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount userAccount = new BankAccount(1000.0);

        // Create an ATM instance
        ATM atm = new ATM(userAccount);

        // Run the ATM interface
        atm.run();
    }
}
