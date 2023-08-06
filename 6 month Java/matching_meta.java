import java.util.*;
public class matching_meta
{
    public static void main(String[] args) 
    {
        // find email id is on gmail.  
        // find username and domain name for email. 
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email = ");
        String str=sc.nextLine();

        System.out.println("Valid input = "+(str.contains("gmail.com")));
        
        int str1=str.indexOf('@');


        System.out.println("Username: "+(str.substring(0,str1)));
        System.out.println("Domain: "+(str.substring(str1+1,str.length())));
    }
}
