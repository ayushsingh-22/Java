import java.util.Scanner;
class test
{
    static int p=18220;
    int a,b=20;

    static double testper(int num)
    {
        switch(num)
        {
            case 1 : return (double)(p*0.9+p);
            case 2 : return (double)(p*0.1+p);
            default: return 0.0f;
        } 

    }
}

public class statickeypracc 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter valye of num = ");
        int f = sc.nextInt();
        System.out.println("Test percentage = "+test.testper(f));
        sc.close();
    }
    
}


