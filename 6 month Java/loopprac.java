import java.util.*;
public class loopprac
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        
        // Multiplication of number;
        
        // int num;
        // System.out.print("Enter number: ");
        // num=sc.nextInt();

        // for(int i=1;i<11;i++)
        // {
        //     int tab=num*i;
        //     System.out.printf("%d x %d = %d\n",num,i,tab);
        // }

        // Sum of n-number;

        // int n;
        // int sum = 0;
        // int i=1;

        // System.out.print("Enter number = ");
        // n=sc.nextInt();

        // while(i<=n)
        // {
        //     sum=sum+i;
        //     i++;
        // }
        // System.out.printf("Sum of %d = %d",n,sum);

        // factorial of given number;

    //     int fact=1,n;

    //     System.out.print("Factorial of: ");
    //     n=sc.nextInt();

    //    for(int i=1; i<=n;i++)
    //    {
    //       fact = fact*i;
    //    }
    //     System.out.printf("Fcatorial of %d = %d",n,fact);

        // print each digit of number.
        
        // System.out.print("Enter digit = ");
        // int digit=sc.nextInt();

        // while(digit>0)
        // {
        //     int rem=digit%10;
        //     System.out.print(rem+",");
        //     digit=digit/10;
        // }

        // count digit of number;

        System.out.print("Enter number = ");
        int n=sc.nextInt();
        int i=0;

        while(n>0)
        {
            n=n/10;
            i++;
        }
        System.out.printf("Total number of digit in %d is %d",n,i);


    }
}