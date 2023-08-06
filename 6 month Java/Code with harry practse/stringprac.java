import java.util.*;
public class stringprac
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner (System.in);
       
        // String str = "Happy New Yaer 2023";
        // System.out.println(str.toLowerCase());
        // System.out.println(str.replaceAll(" ","_"));

        // String name = ("Enter your name = ");
        // System.out.print(name);
        // name=sc.nextLine();
        // String letter = ("Dear |<Name>|, Thanks a lot.");
        // System.out.println(letter.replace("|<Name>|", name));


        // System.out.print("Enter your String = ");
        // String str1=sc.nextLine();

        // if(str1.contains("  "))
        // {
        //     System.out.println("Double space.");
        // }
        // else { System.out.println("No Double space.");}

        //  if(str1.contains("   "))
        // {
        //     System.out.println("Triple space.");
        // }
        // else { System.out.println("No Triple space.");}

        System.out.print("Tell me your name: ");
        String nme=sc.nextLine();
        System.out.print("Name your programming language: ");
        String lan=sc.next();
        System.out.print("Enter duration of course: ");
        int month=sc.nextInt();

        System.out.printf("Hellow %s! Congo to complete %s in %d month.",nme,lan,month);
        }
}