/*  Q1. Find if no. is binary or not.
    Q2. Find if no. is hexadecimal or not.
    Q3. Data format in dd/mm/yyyy.
 */

import java.util.*;
public class regexpques2 
{
    public static void main (String arg[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter valid date = ");
        var d=sc.nextLine();
        System.out.println("This is valid date. ---> "+(d.matches("[0-3][0-9]/[0-1][0-9]/\\d{4}$")));


        System.out.print("Enter your no. x = ");
        var x = sc.nextLine();
        System.out.print("Enter your no. m = ");
        var m = sc.nextLine();

        System.out.println("This is hexadecimal --->" +(x.matches("[A-F0-9]*")));
        System.out.println("This is binary number --->"+(m.matches("[01]+")));
        sc.close();
    }
    
}