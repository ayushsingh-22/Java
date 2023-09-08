import java.util.Scanner;

// calculated area & perimeter of circle

/*
class circle
{
    public double radius;

    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}

public class classprac 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        circle c = new circle();
        c.radius =5;
        System.out.println(c.area());
    }
    
}
*/

// calculate perimeter and area of rectangle 

class rectangle
{
    public int length;
    public int breadth;

    public int area ()
    {
        return length*breadth;
    } 

    public int perimeter ()
    {
        return 2*(length+breadth);
    }

}

class classprac
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner( System.in);
        rectangle rc = new rectangle();
        System.out.print("Enter length = ");
        rc.length=sc.nextInt();
        System.out.print("Enter breadth = ");
        rc.breadth = sc.nextInt();

        System.out.println("Area of rectangle = "+rc.area());
        System.out.println("Area of rectangle = "+rc.perimeter());
        sc.close();
    }
}