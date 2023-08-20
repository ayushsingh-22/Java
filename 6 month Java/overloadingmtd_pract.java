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

    /* 
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
    static void reverse(int a[])
    {
        for(int i=0; i<(a.length/2);i++)
        {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
           a[a.length - i - 1] = temp;
    
        }
        return;
    
    } 

    public static void main(String args[]) 
    {
        int m[]={3,10,8,9,12,41};
        System.out.print("\nOriginal Array: ");
        for (int num : m) 
        {
            System.out.print(num + ", ");
        }

        reverse(m);

        System.out.print("\nReversed Array: ");
        for (int num : m) 
        {
            System.out.print(num + ", ");
        }
    }
    */

    static boolean valid(String name )
    { 
        return name.matches("[\\Sa-zA-Z\\s]+");
     
    }
    static boolean valid(int age )
    { 
        return age>3 && age<10;
     
    }

    public static void main(String[] args) 
    {
        
        //String nam="ayush KUMAR";
        int age=25;
        boolean legal=valid(age);
        System.out.println(legal);

    }

}
