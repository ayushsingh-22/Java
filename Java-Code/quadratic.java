import java.util.Scanner;
public class quadratic 
{
    public static void main (String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double r1,r2;
        System.out.print("Enter the value of a =  ");
        a=sc.nextInt();
        System.out.print("Enter the value of b =  ");
        b=sc.nextInt();
        System.out.print("Enter the value of c =  ");
        c=sc.nextInt();

        r1= (-b+Math.sqrt((b*b)-(4*a*c)))/(2f*a);
        r2= (-b-Math.sqrt((b*b)-(4*a*c)))/(2f*a);

        System.out.println("r1 of given equation = "+r1);
        System.out.println("r1 of given equation = "+r2);
        sc.close();
    }
    
}
