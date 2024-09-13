import java.util.*;
public class methodmatch 
{
    static int max(int x,int y)
    {   
        return (x>y)? x:y;
        
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a, b;
        System.out.print("Enter value of a = ");
        a=sc.nextInt();
        System.out.print("Enter value of b = ");
        b=sc.nextInt();
        int c= max(a, b);
        System.out.println("Max = "+c);
        sc.close();
    }
    
}
