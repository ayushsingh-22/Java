import java.util.Scanner;
public class area
{
    // public static void main (String [] args)
    // {
    //     Scanner sc=new Scanner(System.in);
    //     float b,h;
    //     System.out.print("Enter height = ");
    //     h = sc.nextFloat();
    //     System.out.print ("Enter breath = ");
    //     b=sc.nextFloat();
    //     float area=(0.5f)*(b*h);
    //     System.out.print("Area of triangle = "+ area);
    // }

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        System.out.print("Enter side1 = ");
        a = sc.nextFloat();
        System.out.print ("Enter side2 = ");
        b=sc.nextFloat();
        System.out.print ("Enter side3 = ");
        c=sc.nextFloat();
        double peri=(a+b+c)/2;
        double area=Math.sqrt(peri*(peri-a)*(peri-b)*(peri-c));
        System.out.println("Perimeter of scaler triangle = "+peri);
        System.out.println("Area of scaler triangle = "+area);


    }
}