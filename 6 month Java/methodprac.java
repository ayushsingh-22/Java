import java.util.*;
public class methodprac
{
    /*
    static int great(int x, int y)
    {
        if(x>y)
        {
            x++;
            System.out.println("Updated value of x " +x);
        }
        else
        {
            System.out.println("Itna kafi hai bhaiya aur kuch nahi.");
        }
        return x;
    }
        public static void main(String[] args) 
        {
            Scanner sc= new Scanner(System.in);

            System.out.print("Value of a = " );
            int a = sc.nextInt();
            System.out.print("Value of b = " );
            int b = sc.nextInt();

            System.out.println("Original value of a " + a);
            System.out.println("Updated value of a " + great(a, b));

        }
     */
    
     /*
    static void update (int a[])
     {
        a[8]=25;
     }

     public static void main(String[] args) 
     {
        int a[]=new int[10];
        a[0]=1; a[1]=14;a[3]=8;



        System.out.print("Original array = ");
        for(int x:a)
        {
            System.out.print(x+", ");
        }
        update(a);
        System.out.println();
        System.out.print("Updated array = ");
        for(int x:a)
        {
            System.out.print(x+", ");
        }
    }
    */

    static void change(int y, int value)
    {
        y=value;
    }

    static void update (int a[], int index, int valu)
     {
        a[index]=valu;
     }

     public static void main(String[] args) 
     {
        int a[]=new int[10];
        a[0]=1; a[1]=14;a[3]=8;

        update(a,4,63);
        System.out.println();
        System.out.print("Updated array = ");
        for(int x:a)
        {
            System.out.print(x+", ");
        }

        System.out.println();
        int x=10; 
        change(x,20);
        System.out.println("Value of x = "+x);
    }
    
}
