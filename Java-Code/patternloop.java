import java.util.*;
public class patternloop 
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        // int count =0;
        for (int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(5<(i+j))
                {
                    System.out.print( ("* ")); 
                }
                else
                {  
                    System.out.print("  ");
                }
            
            }
        System.out.println("");
        }
    }
    
}
