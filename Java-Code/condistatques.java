/* 1. Check wether even or odd.
   2. grade for given marks.
   3. person is younger or not.
 */


import java.util.*;
public class condistatques 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter no. = ");
        // int x = sc.nextInt();

        // if (x%2==0)
        // {
        //     System.out.println("The given number is even");
        // }
        // else
        // {
        //     System.out.println("The given number is odd");
        // }
//---------------------------------------------------------------------------------------------------------------//

        // int mar1, mar2, mar3 ;
        // double percent;
        // System.out.print("Enter mar1 = ");
        // mar1=sc.nextInt();
        // System.out.print("Enter mar2 = ");
        // mar2=sc.nextInt();
        // System.out.print("Enter mar3 = ");
        // mar3=sc.nextInt();

        // percent = ((mar1+mar2+mar3)/300.0)*100;
        // if (percent<=100 && percent>90)
        // {
        //     System.out.println("Congrats! You got 'A' grade with "+percent+"%");
        // }
        // else if (percent<=90 && percent>=80)
        // {
        //     System.out.println("Congrats! You got 'B' grade with "+percent+"%");
        // }
        // else if(percent<=80 && percent>=70)
        // {
        //     System.out.println("Congrats! You got 'c' grade with "+percent+"%");
        // }
        // else
        // {
        //     System.out.println("You got less grade with "+percent+"%"+" need improvment.");
        // }
//-------------------------------------------------------------------------------------------------//

        int age;

        System.out.print("Enter your age = ");
        age = sc.nextInt();

        if (age>=14 && age<= 45)
        {
            System.out.println("Welcome to working class!!!");
        }
        else if (age<=14 && age >0)
        {
            System.out.println("Enjoy your life!!!");
        }
        else if (age>45)
        {
            System.out.println("Time to grow spritually in ur' life.");
        }
        else
        {
            System.out.println("Error! Check your input.");
        }
        sc.close();
    }
    
}
