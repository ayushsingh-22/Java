import java.util.*;

public class fibonnaci 
{
    public static void main(String[] args)
    {
        System.out.println(fibo(24));
    }
    
    public static int fibo(int n)
    {
        if (n==1) return 1;
        if (n==0) return 0;

        int start = 0;
        int sec = 1;

        for(int i =2; i<=n;i++)
        {
            int temp = sec;
            sec = start+sec;
            start=temp;
        }
        return sec;
    }
}
