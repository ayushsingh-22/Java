import java.util.*;
public class tryyyy 
{
     public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a[]={1,4445,23,64,41,603,12,3756930};
       
        int key=0;

        // int sum=0;
        // for(int x: a)
        // {
        //     sum=x+sum;
        // }
        // System.out.println("Sum of given array = "+sum);

        for(int x:a)
        {
            if(key<x)
            {
                key=x;
            }
        }
        System.out.println("Maximum = "+key);

    }
}
