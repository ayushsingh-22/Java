import java.util.*;
public class arrayprac 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        // add of float value array 
    /*
        float a[]={5.2f,3.2f,6.4f,4.1f};
        float sum=0;

        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum of array = "+sum);
    */

        // find element in array

        /*
        int b[]={2,5,6,8,9,11};
        
        System.out.print("Element for finding = ");
        int key=sc.nextInt();

        for(int x:b)
        {
            if(key==x)
            {
                System.out.println("Element found!! ");
                System.exit(0);
            }
        }
        System.out.println("Sorry!! Not Found.");
        */

        // calculate average marks of array

        /*
        int mark[]={45,68,98,90,88,78};
        int sum  = 0;

        for (int x: mark)
        {
            sum=sum+x;
        }
        float avg=sum/6.0f;
        System.out.println("Avergae of marks = "+avg);
        */

        // add two matrices

        /*
        int a[][]={{2,3,4},{7,5,2}};
        int b[][]={{10,5,7},{21,18,9}};
        int c[][] = new int[2][3];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }

        }

        for(int x[]:c)
        {
            for(int y:x)
            {System.out.print(y +" ");}
            System.out.println();
        }
        */

        // reverse an array

        int m[]= new int[6];
        m[1]=2; m[0]=10; m[2]=13; m[3]=9; m[4]=15; m[5]=4;
        
              System.out.print("Original array: ");
        for(int x:m)
        {
            System.out.print(x+", ");
        }

        System.out.println();
        System.out.println("Length = "+m.length);
        
        int temp=m[0];

        for(int i=0; i<m.length-1;i++)
        {
            m[i]=m[i+1];
        }

        m[m.length-1]=temp;

        System.out.print("Reversed array: ");
        for(int x:m)
        {
            System.out.print(x+", ");
        }

    }
    
}
