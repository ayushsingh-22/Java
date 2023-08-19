import java.util.*;
public class overloadingmtd_pract 
{
    /*
    static int over(int x, int y)
    {
        return x>y ? x:y;
    }

    static float over(float x, float y)
    {
        return x>y? x:y;
    }

    public static void main(String[] args) 
    {
        int a=15;
        int b= 33;
        System.out.println("Maximum between a & b is "+over(a,b));
        
    }
    */

    /* 
    static int area(int l, int b)
    {
        return l*b;
    }
     static float area(float l, float b)
    {
        return l*b;
    }
    static double area (double r)
    {
        return Math.PI*r*r;
    }
    static int area(int r)
    {
        return (22/7)*r*r;
    }

    public static void main(String[] args) 
    {
        System.out.println("Area of rectangle = "+area(5,6));
        System.out.println("Area of circle = "+area(5f));
        
    }
    */

    static int reverse(int n) 
    {
        int reversed = 0;
        while (n != 0) {
            int rem = n % 10;
            reversed = reversed * 10 + rem;
            n = n / 10;
        }
        return reversed;
    }
    static int reverse(int a[])
    {
        int temp=a[0];
        
        for(int i=a.length-1; i>=0;i--)
        {
            a[i]=a[a.length-1];
    
        }
        a[a.length-1]=temp;
        return;
    
    } 


    public static void main(String args[]) 
    {
        int m[]={3,10,8,9,41};

        int n=reverse(m);
        for(int x:m)
        System.out.print((x+", "));
    }

}
