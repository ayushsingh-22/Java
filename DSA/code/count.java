import java.util.*;


import java.util.Scanner;

public class count {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        count(n);

    }

    public static void count(int N)
    {
        int count = 1;
        
        while(count<= N)
        {
            System.out.print("GFG" +" ");
            count++;
        }
        
    }


    
}
