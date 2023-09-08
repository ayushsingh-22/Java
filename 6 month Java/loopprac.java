import java.util.*;
public class loopprac
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        
        // Multiplication of number;
        
       /*  int num;
        System.out.print("Enter number: ");
        num=sc.nextInt();

        for(int i=1;i<11;i++)
        {
            int tab=num*i;
            System.out.printf("%d x %d = %d\n",num,i,tab);
        }

        */

        // Sum of n-number;

       /*  int n;
        int sum = 0;
        int i=1;

        System.out.print("Enter number = ");
        n=sc.nextInt();

        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.printf("Sum of %d = %d",n,sum); */

        // factorial of given number;

    /*     int fact=1,n;

        System.out.print("Factorial of: ");
        n=sc.nextInt();

       for(int i=1; i<=n;i++)
       {
          fact = fact*i;
       }
        System.out.printf("Fcatorial of %d = %d",n,fact);

    */

        // print each digit of number.
        
    /*     System.out.print("Enter digit = ");
        int digit=sc.nextInt();

        while(digit>0)
        {
            int rem=digit%10;
            System.out.print(rem+",");
            digit=digit/10;
        }
    */

        // count digit of number;

    /*     
        System.out.print("Enter number = ");
        int n=sc.nextInt();
        int temp = n; 
        int i=0;

        while(n>0)
        {
            n=n/10;
            i++;
        }
        System.out.printf("Total number of digit in %d is %d",temp,i);

    */

        // find 3 digit armstrong number;

    /* 
        System.out.print("Enter digit = ");
        int digit=sc.nextInt();
        int tempa = digit;
        int sum=0;

        while(digit>0)
        {
            int rem=digit%10;
            digit=digit/10;
            sum=(rem*rem*rem)+sum;
        }

        if (sum == tempa)
        {System.out.printf("%d is amstrong number.",tempa);}
        else{System.out.printf("%d is not amstrong number.",tempa);}

    */

        // print reverse of given digit.

    /*
        System.out.print("Enter number = ");
        int orig=sc.nextInt();
        int tamp=orig;

        System.out.printf("Reverse digit of %d is ",orig);
        while(orig>0)
        {
            int re=orig%10;
            System.out.print(re);
            orig=orig/10;
        }
    */

        // palindrome or not

    /*     
        System.out.print("Enter number = ");
        int pal=sc.nextInt();
        int ran=pal;
        int temp=0;
       
        while(pal>0)
        {
            int rem=pal%10;
            temp=temp*10+rem;
            pal=pal/10;
        }
        System.out.println("Reversed number = "+temp);

        if(ran==temp)
        {System.out.println("Palindrome Number.");}
        else
        {System.out.println("Not Palindrome Number.");}

    */

        // display no. in words with tailling zero if present

    /*    
        System.out.print("Enter number = ");
        String str=sc.next();
        String rev="";

        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }

        System.out.println("Reversed digit = "+rev);

    */

        // print A.P. Series;

    /* 
        System.out.print("Enter first digit = ");
        int a=sc.nextInt();
        System.out.print("Enter number of term = ");
        int n=sc.nextInt();
        System.out.print("Enter difference between 2 term = ");
        int d=sc.nextInt();

        for (int i=1;i<=n;i++)
        {
            System.out.print(a+",");
            a=a+d;
        }
    */

        // Print G.P. Series:
    /* 
        System.out.print("Enter first digit = ");
        int a=sc.nextInt();
        System.out.print("Enter number of term = ");
        int n=sc.nextInt();
        System.out.print("Enter difference between 2 term = ");
        int d=sc.nextInt();

        for (int i=1;i<=n;i++)
        {
            System.out.print(a+",");
            a=a*d;
        }
    */

        // Fibonacci series;
    /*
        System.out.print("Enter number of term = ");
        int n=sc.nextInt(); 
        int a=0;
        int b=1;
        System.out.print(a+","+b+",");

        for (int i=1;i<=n-2;i++)
        {
            
            int c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
     */    

        // print star pyramid

        int ns = 4;  // number of spaces in the first line
        int noss = 1; // number of stars in the first line
        
        for (int i = 1; i <= 5; i++) 
        {
            // Print spaces
            for (int j = 1; j <= ns; j++) 
            {
                System.out.print(" ");
            }
            ns--;
            
            // Print stars
            for (int k = 1; k <= noss; k++) 
            {
                System.out.print("*");
            }
            noss = noss + 2;
            System.out.println();  // Move to the next line after printing spaces and stars
        }
        sc.close();
    }
}