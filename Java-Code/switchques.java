/* Q1. display day  on base of number.
   Q2. Perform arthimetic operation using menu driven program
*/

import java.util.*;
public class switchques 
{
    public static void main(String ag[])
    {
        Scanner sc=new Scanner (System.in);
    //     int day;
    //     System.out.print("Enter day number = ");
    //     day = sc.nextInt();
    //     switch(day)
    //     {
    //         case 1: System.out.println("Today is monday.");
    //                 break;
    //         case 2:System.out.println("Today is tuesday.");
    //                 break;
    //         case 3:System.out.println("Today is wednesday.");
    //                 break;
    //         case 4:System.out.println("Today is thursday.");
    //                 break;
    //         case 5:System.out.println("Today is friday.");
    //                 break;
    //         case 6:System.out.println("Today is saturday.");
    //                 break;
    //         case 7: System.out.println("Today is sunday.");
    //                 break;
    //         default: System.out.println("Check your input!!!");
    //                 break;
    //     }
// ====================================================================================================================== //

        String opt;
        int a, b,c;
    
        System.out.println("Enter 'a' & 'b' respectively = ");
        a=sc.nextInt();
        b= sc.nextInt();
        sc.nextLine(); //ise use iseliya kiya hai kyuki jab ham "opt" ka liya input lenga to a&b wala command uska buffer mai hai, to clear memory we use this.

        System.out.print("Enter your option = ");
        opt=sc.nextLine();

        switch(opt)
        {
            case "add": c= a+b;
                        System.out.println("Sum of "+a+ " & " +b +" is "+c + ".");
                        break;
            case "sub": c= a-b;
                        System.out.println("Sum of "+a+ " & " +b +" is "+c+ ".");
                        break;
            case "mult": c= a*b;
                        System.out.println("Sum of "+a+ " & " +b +" is "+c+ ".");
                        break;
            case "div": c= a/b;
                        System.out.println("Sum of "+a+ " & " +b +" is "+c+ ".");
                        break;
            case "rem": c= a%b;
                        System.out.println("Sum of "+a+ "&" +b +"is"+c);
                        break;
            default:  System.out.println("Check your input!!!");
                        break;

         

        }
        
        sc.close();


    }
    
}
