/*  Q1. Remove special character from string.
    Q2. Remove extra space.
    Q3. Count length of string.  */


import java.util.*;
public class regexpques3 
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the string = ");
        String m = sc.nextLine();

        int x = m.length();
        String str1= m.trim();
        String str2 = m.replaceAll("[^A-Za-z0-9]", "");
        System.out.println("Legth of string = "+x);
        System.out.println("Formatted string = "+str1);
        System.out.println("Remove special character = "+str2);

        sc.close();

    }
    
}
