import java.util.Scanner;
import tools.advcalc;

public class calcu 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter n1 = ");
        int n1 = sc.nextInt();

        System.out.print("Enter n2 = ");
        int n2 = sc.nextInt();

        advcalc cc = new advcalc();
       System.out.println( "Addition of " +n1 + " & " +n2+ " = " +cc.add(n1,n2));
       System.out.println( "Max of " +n1 + " & " +n2+ " = " +cc.max(n1,n2));
        
    }

}
