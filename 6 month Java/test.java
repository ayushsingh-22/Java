import java.util.Scanner;
public class test
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int l,b,a;
        System.out.print("Enter length of rectangle = ");
        l=sc.nextInt();
        System.out.print("Enter breath of rectangle = ");
        b=sc.nextInt();
        a = l*b;
        System.out.print("Area of rectangle = "+a);
    }
}