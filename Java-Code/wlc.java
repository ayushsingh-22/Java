import java.util.Scanner;
public class wlc 
{
    public static void main (String[] arg )
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name;
        name = sc.nextLine();
        /*ya par nextLine ka use iseliya kiya hai taki ham 
          ek sa jayda word ka print kar saka */
        System.out.println("Welcome "+name);
        sc.close();
    }





    
}
