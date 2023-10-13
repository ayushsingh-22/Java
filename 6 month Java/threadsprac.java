class threads extends Thread 
{
    public void run()
    {
        int i=0;
        while(i<20)
        {
            System.out.print("Hello "+" ");
            i++;
        }
        System.out.println();
    }
}

public class threadsprac
{
    public static void main(String[] args) 
    {
        threads td = new threads();
        td.start();
    
        int i=0;
        while(i<20)
        {
            System.out.print("Java " + " ");
            i++;
        }
        System.out.println();
        
    }
}
