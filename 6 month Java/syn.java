import java.util.Scanner;

class fun
{
    void display(String a)
    {
        for (int i = 0; i < a.length(); i++) 
        {
            System.out.print(a.charAt(i)+", ");
        }
        
    }
}

class mythread1 extends Thread
{
    fun f = new fun();

    public void run()
    {
        f.display("Ayush");
    }
}

class mythread2 extends Thread
{
    fun f = new fun();

    public void run()
    {
        f.display("Rakesh");
    }
}

public class syn {
    public static void main(String[] args) 
    { 
        mythread1 m1 = new mythread1();
        mythread2 m2 = new mythread2();
        m1.start();
        m2.start();
    }
}
