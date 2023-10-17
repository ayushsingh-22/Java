import java.util.*;

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
    public double circumference()
    {
        return perimeter();
    }
}

public class classprac 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        circle c = new circle();
        System.out.printf("Enter raius of circle = ");
        c.radius = sc.nextInt();
        System.out.println("Area of circle = "+c.area());
        System.out.println("Perimeter of circle = "+c.perimeter());
        System.out.println("Circumference of circle = "+c.circumference());
        sc.close();
    }
    
}
*/

// calculate perimeter and area of rectangle 

/* 
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
*/

// calculate base area, volume and total area of cyclinder using hiding data logic

/* 
class cyclinder 
{
    private int height;
    private int radius;

    public int getHeight()
    {
        return height;
    }
    public int getRadius()
    {
        return radius;
    }

    public void setHeight(int h)
    {
        height=h;
    }
    public void setRadius( int r)
    {
        radius=r;
    }

    public float lidarea()
    {
        double area = Math.PI*radius*radius;
        return (float)area;
    }

    public float volume()
    {
        float volume = height*radius*radius*(float)Math.PI;
        return volume;
    }

    public float area()
    {
        float area = 2*(float)lidarea()+2*radius*height*(float)Math.PI;
        return area;
    }
}

class classprac
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        cyclinder cy=new cyclinder();

        System.out.print("Enter radius = ");
        int radius = sc.nextInt();
        cy.setRadius(radius);

        System.out.print("Enter height = ");
        int height = sc.nextInt();
        cy.setHeight(height);
        
        System.out.println("Area of cyclinder = "+cy.area());
        System.out.println("Volume of cyclinder = "+cy.volume());
        System.out.println("Base area of cyclinder = "+cy.lidarea());
        sc.close();
    }
}
*/

// calculate average and total marks of students.

/* 
class student
{
    public int m1;
    public int m2;
    public int m3;
    public String name;
    public int roll;

    public int total()
    {
        return m1+m2+m3;
    }

    public float percentage()
    {
        return (total()/300f)*100;
    }

}

class classprac
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        student st = new student();

        System.out.print("Enter your name = ");
        st.name = sc.nextLine();
        System.out.print("Enter m1 = ");
        st.m1= sc.nextInt();
        System.out.print("Enter m2 = ");
        st.m2= sc.nextInt();
        System.out.print("Enter m3 = ");
        st.m3= sc.nextInt();

        System.out.println(st.name + " score " + st.total() + " out of 300.");
        System.out.println(st.name + " got overall " + st.percentage() + "% in all subject. ");
        sc.close();
        
    }
}
*/

// using hiding concept, find area & perimeter of rectangle


class rectangle 
{
    private int length;
    private int width;

    public int getLength()
    {
        return length;
    }

    public void setLength(int l)
    {
        length = l;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int w)
    {
        width = w;
    }

    public int area()
    {
        int ar = length*width;
        return ar;
    }

    public int perimeter()
    {
        int peri = 2*(length+width);
        return peri;
    }
}

class classprac
{
    public static void main(String[] args) 
    {
        rectangle rec = new rectangle();
        rec.setLength(5);
        rec.setWidth(4);

        System.out.println("Area of rectangle = "+ rec.area());
        System.out.println("Perimeter of rectangle = " +rec.perimeter());
        
    }
}


