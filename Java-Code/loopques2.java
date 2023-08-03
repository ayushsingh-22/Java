


import java.util.*;
public class loopques2 
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number = ");
        // int n=sc.nextInt();
        // int r;

        // for(; n > 0; n=n/10)
        // {
        //     r = n % 10;
        //     System.out.println(r);
        // }

// -------------------------------------------------------------------------------------------------------------------- //

        // int n=sc.nextInt();
        // int count=0;

        // for (;n>0;n=n/10)
        // {
        //     count++;
        // }
        // System.out.println(count);

// ----------------------------------------------------------------------------------------------------------------------- //

        // int n=sc.nextInt();
        // int r;

        // for(; n > 0; n=n/10)
        // {
        //     r = n % 10;
        //     System.out.println(r);
        // }
    
// ---------------------------------------------------------------------------------------------------------------------- //

        // int n=sc.nextInt();
        // int temp = n;
        // int r,sum=0;

        // for(; n > 0; n=n/10)
        // {
        //     r = n % 10;
        //     sum=sum+(r*r*r);
        // }

        // if (sum == temp)
        // {
        //     System.out.println("This is amstrong number.");
        // }
        // else
        // {
        //     System.out.println("This is not amstrong number.");
        // }

// ------------------------------------------------------------------------------------------------------------------------- //

        int n,temp, sum=0;
        n=sc.nextInt();
        temp=n;

        for(;n>0;n=n/10)
        {
            int r=n%10;
            sum=sum*10+r;
        }
        System.out.println("Reverse number is = "+sum);

        if (temp == sum)
        {
            System.out.println("It is palindrome.");
        }
        else
        {
            System.out.println("It is not palindrome.");
        }
        sc.close();
    }
    
}
