import java.util.*;
public class methodpraccc2
{
    static boolean prime(int n)
    {
        for (int i=2; i<n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;

    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter no.: ");
        int noo = sc.nextInt();

        boolean res = prime(noo);
        System.out.println("Given value is prime ?? ----> "+ res);
        
    }
}