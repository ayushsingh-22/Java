// import java.util.Scanner;
// import tools.advcalc;

public class calculator 
{
    public static void main(String[] args) 
    {
       java.util.Scanner sc = new  java.util.Scanner (System.in);
       tools.advcalc ad = new tools.advcalc();

        System.out.print("Enter n1 = ");
        int n1 = sc.nextInt();

        System.out.print("Enter n2 = ");
        int n2 = sc.nextInt();

        // advcalc ad = new advcalc();
        
        System.out.println( "Addition of " +n1 + " & " +n2+ " = " +ad.add(n1,n2));
        System.out.println( "Max of " +n1 + " & " +n2+ " = " +ad.max(n1,n2));
        System.out.println( "Power of " +n1 + " raise to " +n2+ " = " +ad.power(n1,n2));
        System.out.println();
        System.out.println( "Remainder of " +n1 + " when divided by " +n2+ " = " +ad.rem(n1,n2));

        sc.close();
    }

}
