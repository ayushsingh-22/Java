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

class threadsprac
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string name --> ");
        name n = new name();
        String s = sc.nextLine();
        n.display(s);
      
    }
}