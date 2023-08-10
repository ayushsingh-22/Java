import java.util.*;
public class nestedloopprac 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

    /*     
        for (int i=1;i<6;i++)
        {
            for(int j=1;j<6;j++)
            {

                System.out.print(j+" ");
            }
            System.out.println();            
        }
    */

    /* 
        for (int i=1;i<6;i++)
        {
            for(int j=1;j<6;j++)
            {

                System.out.print((j+i)+" ");
            }
            System.out.println();   
        }
    */

    /*     
        int count =0;
        for (int i=1;i<6;i++)
        {
            for(int j=1;j<6;j++)
            {
                count++;
                System.out.format("%2d ",count);
            }
            System.out.println(); 
        }
    */

        for (int i=1;i<6;i++)
        {
            for(int j=1;j<=(5-i);j++)
            {
                System.out.print(" "); 
            }
            for(int k=1;k<=(2*i)-1;k++)
            {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }
}
