import java.util.*;

// find area of rectangle using constructor.

/*
class rectangle 
{
    private int length;
    private int width;

    // constructor class
    public rectangle()
    {
        length = 1;
        width = 1;
    }

    public int getLength()
    {
        return length;
    }

    public int getWidth()
    {
        return width;
    }

    public void setLength(int l)
    {
        length=l;
    }

    public void setWidth(int w)
    {
        width=w;
    }

     public rectangle(int l, int w)
    {
        length = l;
        width = w;
    }
    
    public int area()
    {
        return length * width;
    }
    
}

public class constrpracc 
{
    public static void main(String[] args) 
    {
        rectangle rc = new rectangle(5,6);
        // rc.setLength(5);
        // rc.setWidth(6);
        System.out.println("Area of rectangle = "+ rc.area() );

        
    }
    
}
*/

// using constructor find area of cyclinder

class cyclinder
{
    private float radius;
    private float height;

    public cyclinder()
    {
        radius = 1;
        height = 1;
    }

    public float getRadius()
    {
        return radius;
    }

    public float getHeight()
    {
        return height;
    }

    public void setHeight(float h)
    {
        if(height>0)
        {
            height = 0;
        }
        else
        height = h;
    }

    public void setRadius(float r)
    {
         if(radius>0)
        {
            radius = 0;
        }
        else
        radius = r;
    }

    public float area()
    {
        float ara = (float)Math.PI*radius*radius*height;
        return ara;
    }

    public float volume()
    {
        return ((float)Math.PI*height*radius*radius);
    }

}

class constrpracc
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        cyclinder cy = new cyclinder();

        System.out.print("Enter radius = ");
        float rad = cy.setRadius();
        rad = sc.nextInt();
        System.out.print("Enter height = ");
        float ht = cy.setHeight();
        ht = sc.nextInt();

        System.out.println("Volume of cyclinder = "+cy.area());

        
    }
}