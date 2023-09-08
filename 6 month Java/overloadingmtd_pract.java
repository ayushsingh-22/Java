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
        float a = 15.2f;
        float b = 33.3f;
        System.out.println("Maximum between a & b = "+over(a,b));
        
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

    /* 
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
    */

    /* 
    static int max(int ...a)
    {
        int m = a[0];
        if (a.length==0)
            {
               return 0;
            }
        for(int i=1; i<a.length;i++)
        {
            if(a[i]>m)
            {
                m=a[i];
            }
            
        }
        return m;
    }

    public static void main(String[] args) 
    {
        int s = max(0,20,55,63,45,58,25);

        System.out.println("Max = "+s);
        
    }
    */

    /*
    static int sum(int...a)
    {
        int sum = 0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum + a[i];
        }
        return sum;
    }
    
    static float sum(float...a)
    {
        float sum = 0f;
        for(int i=0;i<a.length;i++)
        {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        float m = sum(15.2f,25.2f,50.4f,10.72f);
        System.out.println("Sum of all element of m = "+m);
    }
    */

    static float sum(float...a)
    {
        float sum = 0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum + a[i];
        }

       float dis;
        if (sum < 500f);
        {
            dis = 0.1f*sum;
        }
        return dis;
    }

    static float sum(int...a)
    {
         float dis=0;
        int sum = 0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum + a[i];
        }
        System.out.println("Total amount of shopping = "+sum);
      
        if (sum <= 500)
        {
            dis = 0.1f*sum;
            dis = sum - dis;
        }
        else if (sum > 500 && sum < 1000)
        {
            dis = 0.2f*sum;
            dis = sum - dis;
        }
        else if (sum >= 1000)
        {
            dis = 0.25f*sum;
            dis = sum - dis;
        }
        return dis;
    }
    
    

    public static void main(String[] args) 
    {
        float m = sum(1050,255,120);
        System.out.println("Amount spend after discount = "+m);
    }

}
