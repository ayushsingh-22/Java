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

/* 
import java.util.Scanner;

class name
{
    public void display(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            System.out.println("Character at index "+ i + " --> "+ s.charAt(i));
        } 
    }
}

class data extends Thread
{
    name nm;

    public void run()
    {
      
      System.out.println("Hellow world ");
    }
}

class data2 extends Thread
{
    name nm;

    public void run()
    {
      
      System.out.print("Hellow");
    }
}



class threadsprac
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string name --> ");
        name n = new name();
        String s = sc.nextLine();
        n.display(s);

        data dt = new data();
        dt.start();

        data2 dt2 = new data2();
        dt2.start();

        sc.close();
      
    }
}
*/

// ise code mai dono thread ek sath run hoga jis sai mix output aayaga //

/* 
class mydata 
{
  void display(String s)
  {
      for(int i=0;i<s.length(); i++)
        {
          System.out.print(s.charAt(i));
        }
  }
}
class mythread1 extends Thread
{
  mydata d;

  mythread1(mydata da)
  {
    d = da;
  }

  public void run()
  {
    d.display("Bihar chandragupta ki rajdhani ");
  }
}

class mythread2 extends Thread
{
  mydata d;

  mythread2(mydata da)
  {
    d = da;
  }

  public void run()
  {
    d.display("Delhi bahut pasand haiiii ");
  }
}
class threadsprac
{
  public static void main(String[] args)
  {
    mydata d1 = new mydata();
    mythread2 t2 = new mythread2(d1);
    mythread1 t1 = new mythread1(d1);
    t1.start();
    t2.start();
  }
}
*/

// syncronized ka use karna sai ab seprate output aayaag //

/* 

//ham syncronized aisa initiate kar sakta hai //
class mydata 
{
 synchronized void display(String s)
  {
      for(int i=0;i<s.length(); i++)
        {
          System.out.print(s.charAt(i));
        }
  }
}

// aur aisa bhi kar sakta hai output same hi hoga // 


// class mydata 
// {
//  void display(String s)
//   {
//      synchronized(this)
//      {
//        for(int i=0;i<s.length(); i++)
//         {
//           System.out.print(s.charAt(i));
//         }
//      }
//   }
// }
class mythread1 extends Thread
{
  mydata d;

  mythread1(mydata da)
  {
    d = da;
  }

  public void run()
  {
    d.display("Bihar chandragupta ki rajdhani.// ");
  }
}

class mythread2 extends Thread
{
  mydata d;

  mythread2(mydata da)
  {
    d = da;
  }

  public void run()
  {
    d.display("Delhi bahut pasand haiiii. //");
  }
}
class threadsprac
{
  public static void main(String[] args)
  {
    mydata d1 = new mydata();
    mythread2 t2 = new mythread2(d1);
    mythread1 t1 = new mythread1(d1);
    t1.start();
    t2.start();
  }
}
*/

// ATM Machine challenge //

class atm 
{
    void checkbalance(String name ) 
    {
        System.out.println(name + "! checked balance.");
    }
    void withdraw(String name, int amount) 
    {
        System.out.println(name + "withdraw money having amount " + amount + " rupees. ");
    }
}

class customer extends Thread
{
    atm at;
    int amount; 
    String name;

    customer(String n,atm a,int amt)
    {
        name=n;
        at=a;
        amount=amt;
    }

    public void run()
    {
      at.checkbalance(name);
      at.withdraw(name, amount);
    }


    
}

class threadsprac
{
  public static void main(String[] args) 
  {
     atm t = new atm();
     customer c1 = new customer("Ayush", t, 10000);
     customer c2 = new customer("Ram", t, 789562);
      c1.start();
      c2.start();
  }
}