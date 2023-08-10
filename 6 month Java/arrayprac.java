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

    /* 
        int A[]={3,9,7,8,11,12,16,20,5,13};
        System.out.print("Enter element for finding = ");
        int key=sc.nextInt();

        for(int x:A)
        {
            if(x==key)
            {System.out.println("Searching result found!!");
            System.exit(0);
            }
        }
        System.out.println("Sorry not found.");
    */
        
        // find maximum from array

    /* 
        int a[]={1,4445,23,64,41,603,12,3756930};
        int key=0;

        for(int x:a)
        {
            if(key<x)
            {
                key=x;
            }
        }
        System.out.println("Maximum element = "+key);
    */

        // find 2nd maximum
    
    /* 
        int a[]={1455,45,23,64,41,603,12,37};
        int max1=a[0];
        int max2=0;

        for(int x:a)
        {
            if(max1<x)
            {
                max2=max1;
                max1=x;
            }
            else if(max2<x)
            {
                max2=x;
            }
        }
        System.out.println("First maximum is "+max1);
        System.out.println("Second maximum is "+max2);
    */

    /* 
        // rotate an array

        int a[]={14,45,23,64,41,60,12,37};
        int temp=a[0];

    //  this loop used for printing array

        System.out.print("Original Array = ");
        for(int x:a)
        {
            System.out.print(x+", ");
        }
    // this loop used for reversing the array

        for(int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }
        a[a.length -1]=temp;
    //  this loop used for printing array

        System.out.printf("\nReversed Array = ");
        for(int x:a)
        {
            System.out.print(x+", ");
        }
    */
        

        //  inserting element in array
    /* 
        int A[] = new int [15];
        A[1]=10; A[0]=5; A[3]=34;A[2]=4;A[4]=22;A[5]=33;

        int i=2;

        for(int x=A.length-1;x>i;x--)
        {
            A[x]=A[x-1];
        }
        A[i]=99;

        for(int x:A)
        {
            System.out.print(x+", ");
        }
    */

        // deleteing an array

        int a[]={14,45,23,64,41,60,12,37};

        System.out.print("Enter index: ");
        int x=sc.nextInt();

        for(int i=x;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }

       for(int i=0;i<a.length-1;i++)
        {
            System.out.print(a[i]+", ");
        }
    } 
}
