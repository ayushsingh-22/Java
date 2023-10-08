/* 
import java.util.Scanner;
class NegativeException extends Exception
{
    public String toString()
    {
        return "Dimension never be negative.";
    }
}

class trycatchprac
{
    static int mtd1(int l, int b) throws NegativeException
    {
        if(l<0 || b<0)
            throw new NegativeException();
        return l*b;
    }

    static int mth2() throws NegativeException
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of l & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return mtd1(a,b);
    }

    static int mth3() throws NegativeException
    {
       return mth2();
    }

    public static void main(String[] args) 
    {
        try
        {
        System.out.println("Area = " +mth3());
        }
        catch(NegativeException e)
        {
            System.out.println(e);
        }

        finally
        {
            System.out.println("Dekh ya to chlna hi hai!!!!");
        }

    }

}
*/

import java.util.Scanner;
// class NegativeException extends Exception
// {
//     public String toString()
//     {
//         return "Dimension never be negative.";
//     }
// }

class trycatchprac
{
    static int mtd1(int l, int b) throws Exception
    {
        if(l<0 || b<0)
            throw new Exception();
        return l*b;
    }

    static int mth2() throws Exception
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of l & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return mtd1(a,b);
    }

    static int mth3() throws Exception
    {
       return mth2();
    }

    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Area = " +mth3());
        }

        catch(Exception e)
        {
            System.out.println(e);
        }

    }

}