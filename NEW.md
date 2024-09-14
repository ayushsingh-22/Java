Q. Explain concept of data hiding in java in detail.

Ans.: 
Data hiding is one of the core principles of Object-Oriented Programming (OOP), and it refers to the practice of restricting direct access to some of an object's data and methods. It allows an object to shield its internal state (data) from outside interference and misuse, ensuring better control over how data is modified or accessed. In Java, this is achieved primarily through encapsulation by using access modifiers and getter/setter methods.

Data hiding helps to:

Protect data integrity by controlling modifications.
Reduce complexity by hiding implementation details from the user.
Improve security and maintainability.
Key Concepts of Data Hiding in Java
Encapsulation: This is the mechanism that helps in data hiding by bundling data (attributes) and methods (functions) that manipulate the data into a single unit (a class). Encapsulation is achieved by using:

Private variables (to hide the data).
Public methods (to provide controlled access).
Access Modifiers: Java provides four access levels (modifiers) to control visibility and access to class members (attributes and methods):

Private: The most restrictive access level. A private member is accessible only within the class in which it is declared.
Default (package-private): Accessible only within the same package.
Protected: Accessible within the same package and by subclasses (even if the subclass is in a different package).
Public: The least restrictive. A public member can be accessed from any class or package.
How Data Hiding is Implemented
Example of Data Hiding with a Class
java
Copy code
public class BankAccount {
    // Private attributes: hidden from outside classes
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public method to access the balance (getter method)
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money (validates the input)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Public method to withdraw money (validates the input)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount");
        }
    }
}
Explanation:
Private Data Members:
In the BankAccount class, the attributes accountNumber and balance are marked as private. This means that no other class can directly access or modify them.
Public Methods for Access:
The getBalance(), deposit(), and withdraw() methods are public. These methods allow controlled access to the balance attribute while ensuring that only valid operations (like depositing a positive amount) can be performed.
Data Protection:
By using private variables and providing public methods, the class ensures that the account's balance cannot be arbitrarily modified by external classes or users, which protects the integrity of the data.
Why Data Hiding is Important
Security and Integrity of Data:

When class attributes are hidden using the private modifier, direct access from outside the class is not possible. This prevents unintended or malicious changes to the object's state. For instance, you can't directly set a bank account's balance to a negative number by mistake.
Controlled Access:

Data hiding allows you to control how external users interact with the object's data. By exposing only specific methods to access or modify the data, you ensure that the data is handled appropriately. For example, a bank account's balance can only be updated through deposit or withdrawal operations, which validate the inputs.
Abstraction:

Data hiding helps in achieving abstraction, where the internal workings of a class are hidden from the user, and only essential details are exposed. The user doesn't need to know how the balance is stored or manipulated internally; they only interact with the deposit and withdrawal methods.
Loose Coupling:

By hiding internal data, objects become more independent and loosely coupled. Other parts of the program don't need to know or rely on the exact implementation of the data and methods inside the class. This makes the code more modular and easier to maintain or update.
Maintainability:

Since the internal implementation details are hidden, you can change the inner workings of the class (like changing the way data is stored or validated) without affecting other parts of the program that rely on the class. The public methods act as a stable interface, providing consistency.
Example Without Data Hiding (Risk of Direct Access)
If the class does not use data hiding, the object's internal data is exposed, leading to potential issues like unwanted or invalid data modification.

public class BankAccount {
    public String accountNumber;
    public double balance;
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.balance = -1000;  // Directly setting an invalid balance
        System.out.println("Balance: " + account.balance);  // Output: -1000
    }
}
In this case, without data hiding:

--> The balance is publicly accessible, which allows any external class or method to modify it without any restrictions or validation.
This can lead to incorrect or dangerous data, such as a negative bank balance.
