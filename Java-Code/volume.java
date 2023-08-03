import java.util.*;
public class volume 
{
    public static void main(String arg[])
    {
        int l,b,h;
        float area,volume;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length = ");
        l=sc.nextInt();
        System.out.print("Enter breath = ");
        b= sc.nextInt();
        System.out.print("Enter height = ");
        h = sc.nextInt();

        area=2*((l*b)+(b*h)+(h*l));
        volume= l*b*h;
        System.out.println("Area of cuboid = "+area);
        System.out.println("Volume of cuboid = "+volume);
        sc.close();
    }
    }
