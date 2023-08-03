/* Q1. Find if email id is on gmail.com.
   Q2. Find username and domain from email.
 */

import java.util.*;
public class regexpques
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your e-mail = ");
        String email=sc.nextLine();
        System.out.println("This is valid email ----> "+(email.matches("\\w+@gmail[.com]*")));

        int i = email.indexOf('@');
        System.out.println("Index of @ ="+i);
        int slength=email.length();

        String username= email.substring(0,i);
        String domain = email.substring(i+1,slength );
        System.out.println("Username contain in email = "+username);
        System.out.println("Domain contain in email = "+domain);
        sc.close();
    }
    
}
