import java.util.*;
public class iff_else_prac
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        
// Find even 0r odd 
        
        // System.out.print("Enter digit = ");
        // int a=sc.nextInt();

        // if (a%2==0)
        // {
        //     System.out.printf("%d is even number.",a);
        // }
        // else {System.out.printf("%d is odd number.",a);}
    

// find who is elder.

        // System.out.print("Enter age of person1 = ");
        // int p1=sc.nextInt();
        // System.out.print("Enter age of person2 = ");
        // int p2=sc.nextInt();
        // System.out.print("Enter age of person3 = ");
        // int p3=sc.nextInt();

        // if (p1>p2 && p1>p3)
        // {System.out.printf("Person 1 is elder.");}
        // else if (p2>p3)
        // {System.out.printf("Person 2 is elder.");}
        // else 
        // {System.out.printf("Person 3 is elder.");}

// Find leap year.

    //     System.out.print("Enter year = ");
    //     int yr=sc.nextInt();

    //     if(yr%4==0)
    //     {
    //         if(yr%400==0 || yr%100!=0)
    //         {System.out.println(yr+" is leap year.");}
    //         else {System.out.printf("%d is not leap year.",yr);}
    //     }
    //    else {System.out.printf("%d is not leap year.",yr);}


// find radix of given number.

//     System.out.print("Enter digit = ");
//     String str = sc.nextLine();

//     if(str.matches("[0-1]+"))
//     {System.out.printf("Radix of %s is 2 (i.e. binary).",str);
// }
//     else if(str.matches("[0-7]+"))
//     {System.out.printf("Radix of %s is 8 (i.e. octal).",str);
// }
//     else if(str.matches("[0-9A-F]+"))
//     {System.out.printf("Radix of %s is 16 (i.e. hexa deimal).",str);
// }
//     else if(str.matches("[0-9]+"))
//     {System.out.printf("Radix of %s is 10 (i.e. deimal).",str);
// }
//     else {
//         System.out.printf("%s is not a valid digit.", str);
//     }

// Find protocal used and type of website.

        // System.out.print("Enter your website name: ");
        // String website=sc.nextLine();

        // int i=website.indexOf(":");

        // System.out.println("Protocal of website = "+website.substring(0,i));

        // if (website.endsWith(".gov"))
        // {System.out.println("Given url belong to government organization.");}
        // else if (website.endsWith(".com"))
        // {System.out.println("Given url belong to commercial organization.");}
        // else if (website.endsWith(".net"))
        // {System.out.println("Given url belong to public organization.");}
        // else if (website.endsWith(".biz"))
        // {System.out.println("Given url belong to private organization.");}
        // else {System.out.println("Not valid url or dangerous websites.");}

// Display type of website using switch case.

        //   System.out.print("Enter your url: ");
        //   String url=sc.nextLine();  

        //   String type = url.substring((url.lastIndexOf(".")+1));
        //    System.out.println(type);

        //   switch (type)
        //   {
        //     case "com": System.out.println("Type: Commercial Website.");
        //     break;
        //     case "gov": System.out.println("Type: Government Website.");
        //     break;
        //     case "net": System.out.println("Type: Networking Website.");
        //     break;
        //     default: System.out.println("Warning! Enter valid URL.");
        //     break;
        //   }

// Menu driven program for arthimetic operation.
            

            System.out.print("Enter '+','-','*'.'/','%' : ");
            String oper=sc.next();

            int a,b,c;
            System.out.print("Enter a = ");
            a=sc.nextInt();
            System.out.print("Enter b = ");
            b=sc.nextInt();

            switch (oper) 
            {
                case "+": 
                    System.out.printf("Addition of %d & %d = %d ",a,b,c=(a+b));
                    break;
                case "-": 
                    System.out.printf("Subtract of %d & %d = %d ",a,b,c=(a-b));
                    break;
                case "*": 
                    System.out.printf("Multiply of %d & %d = %d ",a,b,c=(a*b));
                    break;
                case "/": 
                    if (b != 0) 
                    {  System.out.printf("Divide of %d & %d = %f", a, b,((float) a / b));} 
                    else {
                    System.out.println("Error: Division by zero is not allowed.");}
                    break;
                case "%": 
                    System.out.printf("Remainder of %d & %d = %d",a,b,c=(a%b));
                    break;
                default:
                    System.out.printf("Warning! Invalid entry");
                    break;
            }
            sc.close();



        }


}