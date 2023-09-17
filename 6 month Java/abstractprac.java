import java.util.*;

// Example of abstract class //

/* 
abstract class superr
{
    public superr()
    {
        System.out.println();
        System.out.println("Super constructor");
    } 

    void mtd1()
    {
        System.out.println("Calling mth1.");
    }

    abstract void mtd2();

}

class sub extends superr
{
    public void mtd2()
    {
        System.out.println("Over take abstract method");
        System.out.println();
    }
}

public class abstractprac 
{
    public static void main(String[] args) 
    {
        superr sc = new sub();
        sc.mtd1();
        sc.mtd2();
    }    
}
*/

// student challenge of abstract class 

abstract class shape 
{
    abstract float area();
    abstract float perimeter();
}

class rectangle extends shape
{
    float length, breath;
    
    float area()
    {
        return length*breath;
    }

    float perimeter()
    {
       return 2*(length+breath);
    }
}

class circle extends shape
{
    float radius ;

    float  area()
    {
       return (float)Math.PI*radius*radius;
    }

    float perimeter()
    {
        return 2*(float)Math.PI*radius;
    }
}

class abstractprac 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        circle c = new circle();
        rectangle rc = new rectangle();

        System.out.print("Enter radius = ");
        float radius = sc.nextFloat();
        c.radius = radius;

        System.out.println("Area = "+c.area());
        System.out.println("Perimeter = "+c.perimeter());

        System.out.print("Enter length = ");
        float length = sc.nextFloat();
        rc.length = length;

        System.out.print("Enter breath = ");
        float breath = sc.nextFloat();
        rc.breath = breath;

        System.out.println("Area = "+rc.area());
        System.out.println("Perimeter = "+rc.perimeter());

        
    }
}