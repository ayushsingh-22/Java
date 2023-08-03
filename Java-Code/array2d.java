import java.util.*;
public class array2d 
{
    public static void main(String arg[])
    {

// ----------------------------------------PRACTISE--------------------------------------------- //
        // int a[][]=new int [3][];
        // a[0]=new int [5];
        // a[1]=new int [1];
        // a[2]=new int [8];

        // for (int x=0;x<a.length;x++)
        // {
        //     for (int y=0;y<a[x].length;y++)
        //     {
        //         System.out.print(a[x][y]+",");
        //     }
        //     System.out.print("\n");
        // }

// ---------------------------ADD 2 MATRIX--------------------------------- //

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
        int a[][]=new int [m][n];
        int b[][]=new int [m][n];
        int c[][]=new int [m][n];
        
        System.out.println("Matrix 'A' element: ");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix 'B' element: ");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("");

        System.out.println("Matrix A: ");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+",");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("Matrix B: ");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(b[i][j]+",");
            }
            System.out.println("");
        }

        // for (int i=0;i<m;i++)
        // {
        //     for (int j=0;j<n;j++)
        //     {
        //         c[i][j]=a[i][j]+b[i][j];
        //     }
        // }


        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                c[i][j]=a[i][j]*b[i][j];
            }
        }

        System.out.println("");

        System.out.println("Matrix c: ");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(c[i][j]+",");
            }
            System.out.println("");
        }

    }
    
}
