import java.util.Scanner;
public class area_triangle {

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int height, base;
        float area;
        System.out.print("Enter height of triangle =  ");
        height = sc.nextInt();
        System.out.print("Enter base of triangle = ");
        base = sc.nextInt();

        area=((height*base)/2f);

        System.out.println("Area of triangle is "+area);
        sc.close();
    }
    
}
