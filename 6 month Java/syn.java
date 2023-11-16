class fun
{
    void display(String a)
    {
    synchronized(this)
    {
        for (int i = 0; i < a.length(); i++) 
        {
            System.out.print(a.charAt(i)+", ");
        }  
    }
    }
}

class mythread1 extends Thread
{
    fun f;

    mythread1(fun fa)
    {
        f=fa;
    } 

    public void run()
    {
        f.display("Ayush");
    }
}

class mythread2 extends Thread
{
    fun f;

    mythread2(fun f2)
    {
        f=f2;
    } 

    public void run()
    {
        f.display("fngiopt");
    }
}

public class syn {
    public static void main(String[] args) 
    { 
        fun f = new fun();
        mythread1 m1 = new mythread1(f);
        mythread2 m2 = new mythread2(f);
        m1.start();
        m2.start();
    }
}
