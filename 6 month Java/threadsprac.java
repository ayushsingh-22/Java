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
    d.display("Bihar ");
  }
}

class mythread2 extends Thread
{
  mydata d2;

  mythread2(mydata da2)
  {
    d2 = da2;
  }

  public void run()
  {
    d2.display("Delhi");
  }
}

class threadsprac
{
  public static void main(String[] args)
  {
    mydata d1 = new mydata();
    mydata d2 = new mydata();
    mythread1 t1 = new mythread1(d1);
    mythread2 t2 = new mythread2(d2);
    t1.start();
    t2.start();
  }
}
*/

class Complex{
    double real;
    double img;

    Complex(double real, double img){
        this.real = real;
        this.img = img;
    }

    void display(){
        System.out.println(real + "+" + img + "i");
    }
}

class AddComplex extends Complex{

    private double SumReal;
    private double SumImg;

    AddComplex(double real1, double img1,double real2, double img2) {
        super(real1, img1);
        SumReal = real1 + real2;
        SumImg = img1 + img2;
    }

    void displaySum(){
        System.out.print(SumReal + "+" + SumImg + "i");
    }
}

public class threadsprac {
    public static void main(String[] args) {
        Complex c1 = new Complex(2,4);
        Complex c2 = new Complex(1,5);
        AddComplex sum = new AddComplex(c1.real, c1.img, c2.real,c2.img);

        System.out.println("Complex Numbers");
        c1.display();
        c2.display();

        System.out.print("Sum = ");
        sum.displaySum();
    }
}

