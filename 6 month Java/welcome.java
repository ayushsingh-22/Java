import java.util.Scanner;
public class welcome
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("May I known your name ");
        String a = sc.nextLine();
        System.out.println("Welcome "+a);
        sc.close();
    }
}