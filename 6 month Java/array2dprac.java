import java.util.*;
public class array2dprac
{
    public static void main(String[] args) 
    {
        
    Scanner sc=new Scanner (System.in);

    // adding two matrix

/*
    int a[][]={{2,3,4},{7,8,9}};
    int b[][]={{8,3,6},{2,4,6}};
      
    int c[][] = new int[2][3];
    for(int i=0; i<c.length;i++)
    {
        for(int j=0;j<a[i].length;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
        }
    }

    for(int x[]:c)
    {
        for(int y:x)
        {
            System.out.print(y+", ");
        }
        System.out.println();
    }
*/
    
    // //  multiply 2 matric;

    int a[][]={{2,3,4},{7,8,9},{2,4,6}};
    int b[][]={{8,3,6},{2,4,6},{4,2,3}};
      
    int c[][] = new int[3][3];

    for(int i=0; i<c.length;i++)
    {
        for(int j=0;j<a[i].length;j++)
        {
            c[i][j]=0;
            for(int k=0;k<a[i].length;k++)
            c[i][j]=(a[i][k]*b[k][j])+ c[i][j];
        }
        
    }

    for(int x[]:c)
    {
        for(int y:x)
        {
            System.out.print(y+", ");
        }
        System.out.println();
    }
    
}
}
