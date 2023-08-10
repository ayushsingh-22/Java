import java.util.*;
public class arrayprac 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        // Sum of elemrnt of array
    /*     
        int A[]={3,9,7,8,11,12,16,20,5,13};
        int sum = 0;
        for (int x:A)
        {
            sum=sum+x;
        }
        System.out.println("Sum of elemrnt of array = "+sum);
    */

        // serach an element in array
        
        int A[]={3,9,7,8,11,12,16,20,5,13};
        System.out.print("Enter element for finding = ");
        int key=sc.nextInt();
        // boolean isvar=false;

        for(int x:A)
        {
            if(x==key)
            {System.out.println("Searching result found!!");
            // isvar=true;
              System.exit(0);
            }
        }
        System.out.println("Sorry not found.");
      
    } 
}
