/* Q1. find radix of given in string.
   Q2. leap year or not.
   Q3. find type of website an protocol used.
*/

import java.util.*;

public class condistatques2

{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the string = ");
        // String str = sc.nextLine();
        
        // if(str.matches("[01]+"))
        // {
        //     System.out.println("This is binary number with radix 2.");
        // }
        // else if (str.matches("[0-9A-F]+"))
        // {
        //     System.out.println("This is hexadecimal number with radix 16.");
        // }
        // else if(str.matches("[0-7]+"))
        // {
        //     System.out.println("This is octal number with radix 8.");
        // }
        // else if(str.matches("[0-9]+"))
        // {
        //     System.out.println("This is decimal number with radix 10.");
        // }
        // else
        // {
        //     System.out.println("Error!! Check you input.");
        // }
// ==================================================================================================== //
        // System.out.print("Enter year = ");
        // int year = sc.nextInt();

        // if (year%4==0)
        // {
        //     if(year%100==0)
        //     {
        //         if(year%400==0)
        //         {
        //             System.out.println(year+" is leap year.");
        //         }
        //         else
        //         {
        //             System.out.println(year+" is not leap year.");
        //         }
        //     }
        //     else
        //     {
        //         System.out.println(year+" is leap year.");
        //     }
        // }
        // else
        // {
        //     System.out.println(year+" is not leap year.");
        // }
// ===================================================================================================== //
    
    System.out.print("Enter the string = ");
    String str = sc.nextLine();
    int m = str.indexOf(":");
    int n = str.lastIndexOf(".");
    int slength=str.length();

    String protocol = str.substring(0,m);
    String domain = str.substring(n+1,slength);

     
    System.out.println("Protocal used by website = " +protocol);
    System.out.println("Extension used by website = " +domain);


    if (protocol.equals( "http"))
    {
        System.out.println("http -------> hyper text transfer protocal");
    }
    else if (protocol.equals("ftp"))
    {
        System.out.println("ftp -------> file transfer protocol");
    }
    else
    {
        System.out.println("Error!!! Check your input.");
    }

    if (domain.equals("com"))
    {
        System.out.println("com -------> Commercial");
    }
    else if (domain.equals("org"))
    {
        System.out.println("org -------> Organization");
    }
    else 
    {
        System.out.println("net --------> network");
    }
    
// ============================================================================================================ //
    sc.close();
    }
    
}