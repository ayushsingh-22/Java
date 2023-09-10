import java.util.*;

import javax.print.DocFlavor.STRING;

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

/* 
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
        if(height<0)
        {
            height = 0;
        }
        else
        height = h;
    }

    public void setRadius(float r)
    {
         if(radius<0)
        {
            radius = 0;
        }
        else
        radius = r;
    }

    public float area()
    {
        float ara = (2*(float)Math.PI*radius*radius)+(2*height*radius*(float)Math.PI);
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
        float rad = sc.nextFloat();
        cy.setRadius(rad);

        System.out.print("Enter height = ");
        float ht = sc.nextFloat();
        cy.setHeight(ht);


        System.out.println("Volume of cyclinder = "+cy.volume());
        System.out.println("Area of cyclinder = "+cy.area());
        sc.close();
    
    }
}
*/

// product - customer challenge

class product
{
    private String itemno;  
    private String name;
    private float price;
    private int quantity;

     public product(String i, String n )
    {
        itemno=i;
        name = n;
    }

    public String getItemno()
    {
        return itemno;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    public int getQuantity()
    {
        return quantity;
    }

    public void setPrice(float p)
    {
        price = p;
    }
    
    public void setQuantity(int q)
    {
        quantity = q;
    }
}

class customer
{
    private String  name;
    private String custid;
    private String mob_no;
    private String email;

    public customer(String n, String c)
    {
        name = n;
        custid = c;
    }

    public String getName()
    {
        return name;
    }

    public String getMob_no()
    {
        return mob_no;
    }

    public String getCustid()
    {
        return custid;
    }

    public String getEmail()
    {
        return email;
    }

    public void setMob_no(String m)
    {
        mob_no = m;
    }

}