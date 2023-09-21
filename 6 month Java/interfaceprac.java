/*
interface test
{
    static int a = 20;
    void mtd1();
    void mtd2();
}

class my implements test
{
    public void mtd1()
    {
        System.out.println();
        System.out.println("Method 1 ha kya.....");
    }

     public void mtd2()
    {
        System.out.println("Method 2 ha kya.....");
        System.out.println();
    }
}

class interfaceprac
{
    public static void main(String[] args) 
    {
        my m = new my();
        m.mtd1();
        m.mtd2(); 

        System.out.println(test.a);
         
    }
}
*/

/*
//Creating interface that has 4 methods  
interface A
{  
void a();//bydefault, public and abstract  
void b();  
void c();  
void d();  
}  
  
//Creating abstract class that provides the implementation of one method of A interface  
abstract class B implements A
{  
public void c(){System.out.println("I am C");}  
}  
  
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
class M extends B
{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  
//Creating a test class that calls the methods of A interface  
class interfaceprac
{  
public static void main(String args[])
{  
    A a=new M();  
    a.a();  
    a.b();  
    a.c();  
    a.d();  
}
    
}  
*/

// student challenge call back

/*
interface member 
{
    void callback();
}

class customer implements member
{
    String name;
    customer (String n)
    {
        name = n;
    }

   public void callback()
    {
        System.out.println("Thank you!! " +name + " visit ");
    }
}

class shop 
{
    member mem[] = new member[100];
    int count = 0;

    void register (member m)
    {
        mem[count++]=m;
    }

    void offer()
    {
        for (int i=0; i<count; i++)
        {
            mem[i].callback();
        }
    }
}

class interfaceprac
{
    public static void main(String[] args) 
    {
        shop sp = new shop();
        customer c1 = new customer("Ayush.");
        sp.register(c1);
        sp.offer();

        
    }
}
*/

import java.util.Scanner;

public class interfaceprac {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        for (int i = 0; i < t; i++) 
        {
            try 
            {
                long x = scanner.nextLong();

                System.out.println(x + " can be fitted in:");

                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) 
                {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) 
                {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) 
                {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) 
                {
                    System.out.println("* long");
                }
            } 
            catch (Exception e) 
            {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}
