import java.util.Scanner;

// class complex
// {
    
//     int real, img;

//     complex(int real, int img)
//     {
//         this.real = real;
//         this.img = img;
//     }

//    /*  void add(int a, int b)
//     {   
//         System.out.println("");

//     }
//     */

// }

// class labpractical
// {
//     public static void main (String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int ar, br, ai, bi;

//         System.out.print("Enter first no. = ");

//         ar = sc.nextInt();
//         ai = sc.nextInt();

//         System.out.print("Enter second no. = ");
       
//         br = sc.nextInt();
//         bi = sc.nextInt();

//         complex c1 = new complex(ar, ai);
//         complex c2 = new complex(br, bi);

//         System.out.println("Sum of two complex no. = " + (c1.real+c2.real)+" + " + (c1.img+c2.img) + " i ");      
//         System.out.println("Subtract of two complex no. = " + (c1.real-c2.real)+" + " + (c1.img-c2.img) + " i ");

//     }
// }

public class labpractical {
    private String name;
    private int age;

    // Constructor
    public labpractical(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) 
    {
        this.age = age;
    }

    public static void main(String[] args) 
    {
        // Creating an instance of the Person class
        labpractical person = new labpractical("John Doe", 25);

        // Using the getter methods to retrieve values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Using the setter methods to modify values
        person.setName("Jane Doe");
        person.setAge(30);

        // Displaying the modified values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}

