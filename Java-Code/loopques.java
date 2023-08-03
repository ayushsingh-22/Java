/* 1. Display multiply table.
   2. Find sum of n - number.
   3. find factorial.
 */

import java.util.*;
public class loopques
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        // int tab,temp;
        // System.out.print("Enter table number = ");
        // tab = sc.nextInt();

        // for(int i=1;i<11;i++)
        // {
        //     temp = tab*i;
        //     System.out.println(tab+ " X " +i+ " = "+ temp );
        // }
        
//  ===========================================================================================================  //

        // int n,sum=0;
        // System.out.print("Enter value of 'n' = ");
        // n = sc.nextInt();

        // for(int i=1;i<=n;i++)
        // {
        //     sum = sum+i;
        // }
        // System.out.println("Sum of 'n' terms = "+sum);

//  ===========================================================================================================  //

        int n,fact=1;
        System.out.print("Enter value of 'n' = ");
        n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of 'n' terms = "+fact);
        sc.close();
    }
    
}
