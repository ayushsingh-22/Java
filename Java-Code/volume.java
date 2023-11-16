 import java.lang.Math;

abstract class shape
{
    public float length;
    public float breadth; 
    public float radius; 
    
    abstract double area();
    abstract double perimeter();
    
}

class circle extends shape
{
    double area()
    {
        
        return  (Math.PI*Math.PI*radius);
    }

    double perimeter()
    {
        return (2*Math.PI*radius);
    }
}

class rectangle extends shape
{
    double area()
    {
        return (length*breadth);
       
    }

    double perimeter()
    {
        return (2*(length*breadth));
    }
}

class volume
{
    public static void main(String[] args) 
    {
        circle c=new circle();
        c.radius = 3;
        System.out.println("Area of circle = "+ c.area());
        
    }
}

