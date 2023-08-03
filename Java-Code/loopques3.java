import java.util.*;


public class loopques3 
{
    public static void main(String arg[])

    {
        Scanner sc=new Scanner(System.in);
        
        // System.out.print("Enter a Number = ");
        // String str=sc.nextLine();
        
        // char c;
        // for(int i=0;i<str.length();i++)
        // {
        //     c=str.charAt(i);
        //     switch(c)
        //     {
        //         case '0':System.out.print("Zero ");
        //                 break;
        //         case '1':System.out.print("One ");
        //                 break;
        //         case '2':System.out.print("Two ");
        //                 break;
        //         case '3':System.out.print("Three ");
        //                 break;
        //         case '4':System.out.print("Four ");
        //                 break;
        //         case '5':System.out.print("Five ");
        //                 break;
        //         case '6':System.out.print("Six ");
        //                 break;
        //         case '7':System.out.print("Seven ");
        //                 break;
        //         case '8':System.out.print("Eight ");
        //                 break;
        //         case '9':System.out.print("Nine ");
        //                 break;
                       
        //     }
        // }
   // ----------------------------------------------------------------------------------------------------------- //
   
        // System.out.print("Enter value of 'a' = ");
        // int a = sc.nextInt();
        // System.out.print("Enter value of 'd' = ");
        // int d = sc.nextInt();
        // System.out.print("Enter value of 'n' = ");
        // int n = sc.nextInt();
        // String str="";
        
        // for A.P. given below:-
        // for (int i=0;i<n;i++)
        // {       
        //         System.out.print(a+",");
        //         a = a +d;
        //         str = str+a; 
        // }
        // System.out.println();
        // System.out.print(str+",");

        // for G.P. given below:-
        // for (int i=0;i<n;i++)
        // {
        //         System.out.print(a+",");
        //         a=a*d;
        // }

// ------------------------------------------- for fibonnaci series ----------------------------------------------------- //

        System.out.print("Enter value of zeroth term = ");
        int a = sc.nextInt();
        System.out.print("Enter value of first term = ");
        int d = sc.nextInt();
        System.out.print("Enter value of 'n' = ");
        int n= sc.nextInt();

        System.out.print(a+",");
        System.out.print(d+",");


        for (int i=0;i<(n-2);i++)
        {
            int c=a+d;
            a=d;
            d=c;
            System.out.print(c+",");
        }

        sc.close();
    }
}    
