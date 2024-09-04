public class aarray 
{
    public static void main(String[] args) 
    {
        int a[] = {14,9,7,8,12,13,18,25,26,15};
        int sum = 0;

        for(int i=0;i<=a.length-1;i++)
        {
            sum = sum + a[i];
        }
        System.out.println("Sum of array element = "+sum);

// ----------------------------------------------------------------------------------------------- // 
        
        // Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter key:");
    //     int key=sc.nextInt();
    //     int i;
    //     for(i=0;i<=a.length-1;i++)
    //     {
    //        if(key==a[i])
    //        {
    //             System.out.println("Match found at "+a[i]);
    //             System.exit(0);
    //        }
    //     }
    //    System.out.println("Error!!!");

// ------------------------------------------------------------------------------------------------- //



// int max=a[0], smax=a[0];
// for(int i=0;i<=a.length-1;i++)
// {
//    if(max<a[i])
//    {
//         max=a[i];
//    }

// }
// System.out.println("First Max = " + max);

// for(int i=0;i<=a.length-1;i++)
// {
//    if(smax<a[i] && a[i]!=max)
//    {
//     smax=a[i];
//    }
  

// }

// System.out.println("Second Max = "+smax);

// ------------------------------------------------------------------------------------------------- //

      
        // int temp2 = a[a.length-1];
        // System.out.print("Original array: ");
        // for(int x:a)
        // {System.out.print(x+",");}

        // int l=a.length-1;
        // for(int i=a.length;i>1;i--)
        // {
        //     a[l]=a[l-1];
        //     l--;
        // }
        // a[0]=temp2;
        // System.out.println("");
       
        // System.out.print("Shifted array: ");
        // for(int x:a)
        // {    
        //     System.out.print(x+",");
        // }
        
// -------------------------------------------------------------------------------------------------------------- //

      
        
        // int a[]=new int[8];
		// a[0]=2;a[1]=5;a[2]=10;a[3]=7;a[4]=13;
		// int n=5;
		
		// System.out.print("Array = ");
		
		// for (int i=0;i<n;i++)
		// {System.out.print(a[i]+",");}
		
		// int index = 3;
		
		// System.out.println("");
		
		// for (int i=n;i>index;i--)
		// {
		//     a[i]=a[i-1];
		// }
		// a[index]=58;
		// System.out.print("New Array = ");
		
		// for (int i=0;i<n+1;i++)
		// {System.out.print(a[i]+",");}
		
// ----------------------------------------------------------------------------------------------------------------- //
                                /* Copying an array */

        // int m[]={2,4,10,11,5,7,15,46,3};
        // int n[]=new int[9];
        // int i;
        // System.out.print("Input array = ");
        // for (int x:m)
        // {System.out.print(x+",");}

        // for(i=0;i<m.length;i++)
        // {
        //     n[i]=m[i];

        // }
        // System.out.println("");
        // System.out.print("New array = ");
        // for (int x:n)
        // {System.out.print(x+",");}

//--------------------------------/* Reverse copying an array */-----------------------------------------//

        // int p[]=new int[9];
        // int m[]={2,4,10,11,5,7,15,46,3};
        // System.out.print("Input array = ");
        // for (int x:m)
        // {System.out.print(x+",");}

        // int i,l=0;
        //  for(i=8;i>=0;i--)
        // {
        //     // int temp = m[l];
        //     p[l]=m[i];
        //     // m[i]=temp;
        //     l++;          
        // }
        // System.out.println("");
        // System.out.print("New array = ");
        // for (int x:p)
        // {System.out.print(x+",");}

// --------------------------------------------------------------------------------------- //
        // int m[]={2,4,10,11,5,7,15,46,3};        
        // int p[]=new int[18];
        
        // System.out.print("Input array = ");
        // for (int x:m)
        // {System.out.print(x+",");}

        // int i;
        // for(i=0;i<m.length;i++)
        // {
        //     p[i]=m[i];
        // }

        // m=p;
      
        // System.out.println("");
        // System.out.print("New array = ");
        // for (int x:p)
        // {System.out.print(x+",");}

        // System.out.println("");
        // System.out.print("Length of array 'm' = "+m.length);
            
    // sc.close();

    }
    
}
