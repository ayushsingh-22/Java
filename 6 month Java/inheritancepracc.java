import java.util.*;

// volume of cyclinder using inheritance

/* 
class circle
{
    public float radius;

    public circle()
    {
        radius=0.0f;
    }

    public float area()
    {
        return (float)Math.PI*radius*radius;
    }

    public float perimeter()
    {
        return 2*radius*(float)Math.PI;
    }
}

class cyclinder extends circle
{
    public float height;

    public cyclinder()
    {
        height = 0f;
    }
    public float volume()
    {
        return area()*height;
    }
}

public class inheritancepracc 
{
    public static void main(String[] args) 
    {
        cyclinder c = new cyclinder();
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter radius = ");
        c.radius = sc.nextInt();
        System.out.print("Enter height = ");
        c.height = sc.nextInt();

        System.out.printf("Volume of cyclinder = %.3f",c.volume());
      
    }
    
}
*/

//  practise class, constructor, inheritance //

/* 
class account
{
    private String name;
    private String accno;
    private String mobile;
    private String date;
    private int balance;
    private String dob;

// constructror class

    public account(String n,String an,String d)
    {
        name = n;
        accno = an;
        dob = d;
        balance = 0;
    }

    // public account()
    // {

    // }

// getter - setter method

    public String getName()
    {
        return name;
    }

   public String getdob()
    {
        return dob;
    }

    public String getMobile()
    {
        return mobile;
    }

    public String getAccno()
    {
        return accno;
    }

    public String getDate()
    {
        return date;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int b)
    {
        balance = b;
    }

    

}

class saving extends account 
{
    public int deposit;
    public int withdrawl;
    public int charges;
    public int fixed;
    public int amt;

   
     public saving()
     {
        super("Ayush", "Fa","gto");
     }

     public void deposit(int withdrawl)
    {
        setBalance(getBalance() + withdrawl);
    }
    public void withdraw(int withdrawl)
    {
        setBalance(getBalance() - withdrawl);
    }

}
*/

// Constructor in heritance //

/* 
class parent 
{
    public parent()
    {
        System.out.println("Parent Constructor.");
    }
}

class child extends parent 
{
    public child()
    {
        System.out.println("Child Constructor.");
    }
}

class grandchild extends child
{
    public grandchild()
    {
        System.out.printf("Grand child Constructor.\n");
    }
}

class inheritancepracc
{
    public static void main(String[] args) 
    {
        grandchild gc = new grandchild();
    }
}
*/

// class Parent 
// {
//     public int publicVar = 10;
//     protected int protectedVar = 20;
//     int defaultVar = 30;
//     private int privateVar = 40;

//     public void publicMethod() {
//         System.out.println("This is a public method in the Parent class");
//     }

//     protected void protectedMethod() {
//         System.out.println("This is a protected method in the Parent class");
//     }

//     void defaultMethod() {
//         System.out.println("This is a default method in the Parent class");
//     }

//     private void privateMethod() {
//         System.out.println("This is a private method in the Parent class");
//     }
// }

// class Child extends Parent 
// {
//     public void displayParentVariables() {
       
//         System.out.println("Inherited publicVar: " + publicVar);
//         System.out.println("Inherited protectedVar: " + protectedVar);
//         System.out.println("Inherited defaultVar: " + defaultVar);

        
//         // System.out.println("Inherited privateVar: " + privateVar);
//     }

//     public void displayParentMethods() {
     
//         publicMethod();
//         protectedMethod();
//         defaultMethod();
        
//         // privateMethod();
//     }
// }

