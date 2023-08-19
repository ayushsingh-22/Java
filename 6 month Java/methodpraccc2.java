import java.util.*;
public class methodpraccc2
{
   /*
    static boolean primechek(int n)
    {
        for (int i=2; i<n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;

    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter no.: ");
        int noo = sc.nextInt();

        boolean res = primechek(noo);
        System.out.println("Given value is prime ----> "+ res);
        
        sc.close();
    }
    */

    /*
    static int gcdcheck(int n1, int n2)
    {
        while (n1!=n2)
        {
            if (n1>n2) 
            {
                n1=n1-n2;
            }
            else n2=n2-n1;
        }
        return n1;
        
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter value of x & y = ");
        int x=sc.nextInt();
        int y=sc.nextInt();

        int m=gcdcheck(x, y);
        System.out.println("Factor of "+x+ " & "+y+" = "+m);
    }
    */

    static int maxelement(int a[])
    {
        int max = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) 
    {
        int b[]={2,5,4,6,12,38,22,24,29};

        int c = maxelement(b);
        System.out.println("Maximum element of array = "+c);
        
    }
}

