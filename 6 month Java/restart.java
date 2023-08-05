import java.util.Scanner;
public class restart
{
    public static void main (String arg[])
    {
        Scanner fo=new Scanner(System.in);
        int a,b;
        System.out.print("Enter a = ");
        a = fo.nextInt();
        System.out.print("Enter b = ");
        b = fo.nextInt();

        int c= a+b;
        System.out.println("Sum of a + b = "+c);        

    }
}