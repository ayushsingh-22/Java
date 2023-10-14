// Using thraed class //

/*
class my extends Thread
{
  public void run ()
  {
    for (int i = 0; i < 20; i++)
    {
    	System.out.print ("Ayush");
    	
    }
  }
}

public class threadsprac
{
  public static void main (String[]args)
  {
    my tc = new my ();
      tc.start ();

    for (int i = 0; i < 20; i++)
      {
	System.out.print ("Hello World");
      }

    System.out.println ();

  }
}
*/

// Using run interface //

/*
class funny implements Runnable
{
    public void run()
    {
        for (int i = 0;; i++)
            {
    	        System.out.print ("Ayush");
            }
    }
}

class threadsprac
{
    public static void main(String[] args) 
    {
        funny fy = new funny();
        Thread td = new Thread(fy);
        td.start();

        for (int i = 0;; i++)
            {
    	        System.out.print ("Good");
            }

    }
}
*/

// Using run interface with different method //

/* 
class threadsprac implements Runnable
{
    public void run()
    {
        for (int i = 0;i<30; i++)
            {
    	        System.out.println ("Ayush");
            }
    }

    public static void main(String[] args) 
    {
        threadsprac fy = new threadsprac();
        Thread td = new Thread(fy);
        td.start();

        for (int i = 0;i<25; i++)
            {
    	        System.out.print ("Good");
            }

    }
}
*/


class MyData
{
      void display(String str)
    {
            for(int i=0;i<str.length();i++)
            {
                 System.out.print(str.charAt(i));
                 
            }
        
    }
}

class MyThread1 extends Thread
{
    MyData d;
    MyThread1(MyData dat)
    {
        d=dat;
    }
    
    public void run()
    {
        d.display("Hello World");
    }
            
    
}

class MyThread2 extends Thread
{
    MyData data;
    MyThread2(MyData dat)
    {
        data=dat;
    }
    
    public void run()
    {
        data.display("Welcome");
    }
            
    
}

class threadsprac 
{
    public static void main(String[] args) 
    {
        MyData d=new MyData();
        
        MyThread1 t1=new MyThread1(d);
        MyThread2 t2=new MyThread2(d);
        
        t1.start();
        t2.start();
        
        
    
    }    
}
