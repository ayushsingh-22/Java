import java.util.*;

public class loopprac {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        // print revers triangle
        /* 
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5+1-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        // find sum of n-even number using while loop
        /*
        System.out.print("Enter no. of terms = ");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n>0)
        {
            sum=sum+2*n;
            n--;
        }
        System.out.printf("Sum of %d even number = %d",temp,sum);
         */

         // find sum of n-odd number using while loop
        /* 
        System.out.print("Enter no. of terms = ");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n>0)
        {
            sum=sum+(2*n-1);
            n--;
        }
        System.out.printf("Sum of %d odd number = %d",temp,sum);
        */

        // print table

        /*
        System.out.print("Table of = ");
        int n=sc.nextInt();
        int m=1;

        while(m<11)
        {
            int p=n*m;
            System.out.printf("%d x %d = %d\n",n,m,p);
            m++;
        }
        */

        // print table in reverse order

        /*
        System.out.print("Table of = ");
        int n=sc.nextInt();
        int m=10;

        while(m>0)
        {
            int p=n*m;
            System.out.printf("%d x %d = %d\n",n,m,p);
            m--;
        }
        */

        // find factorial 

        /*
        System.out.print("Fcatorial of = ");
        int n=sc.nextInt();
        int mul=1;
        if(n>0)
        {
            for(int i=1;i<=n;i++)
            {
                mul=mul*i;
            }
            System.out.printf("Factorial of %d = %d",n,mul); 

        }
        else if(n==0)
        {
            System.out.println("Factorial of 0 = 1"); 
        }
        else
        {
            System.out.printf("Invalid input \n"); 
        }
        */

        // sum of table of n number

        System.out.print("Table of = ");
        int n=sc.nextInt();
        int m=1;
        int sum =0;
        while(m<11)
        {
            int p=n*m;
            // System.out.printf("%d x %d = %d\n",n,m,p);
            sum=sum+p;
            m++;
        }
        System.out.printf("Sum = %d",sum); 

    }
}
