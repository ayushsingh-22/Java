import java.util.Scanner;
public class regularexpression
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        String str1;
        System.out.print("Enter your input = ");
        str1=sc.next();
        System.out.println(str1.matches("[.xyz]?"));
        sc.close();
        
    }
    
}
