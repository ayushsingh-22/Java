import java.util.*;

// volume of cyclinder using inheritance

class circle
{
    public float radius;

    public circle()
    {
        radius=0.0f;
    }

    public float area()
    {
        return (float)Math.PI*radius*radius;
    }

    public float perimeter()
    {
        return 2*radius*(float)Math.PI;
    }
}

class cyclinder extends circle
{
    public float height;

    public cyclinder()
    {
        height = 0f;
    }
    public float volume()
    {
        return area()*height;
    }
}

public class inheritancepracc 
{
    public static void main(String[] args) 
    {
        cyclinder c = new cyclinder();
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter radius = ");
        c.radius = sc.nextInt();
        System.out.print("Enter height = ");
        c.height = sc.nextInt();

        System.out.printf("Volume of cyclinder = %.3f",c.volume());
      
    }
    
}
