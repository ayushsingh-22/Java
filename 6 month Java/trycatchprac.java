/* 
import java.util.Scanner;
class NegativeException extends Exception
{
    public String toString()
    {
        return "Dimension never be negative.";
    }
}

class trycatchprac
{
    static int mtd1(int l, int b) throws NegativeException
    {
        if(l<0 || b<0)
            throw new NegativeException();
        return l*b;
    }

    static int mth2() throws NegativeException
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of l & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return mtd1(a,b);
    }

    static int mth3() throws NegativeException
    {
       return mth2();
    }

    public static void main(String[] args) 
    {
        try
        {
        System.out.println("Area = " +mth3());
        }
        catch(NegativeException e)
        {
            System.out.println(e);
        }

        finally
        {
            System.out.println("Dekh ya to chlna hi hai!!!!");
        }

    }

}
*/

/* 
import java.util.Scanner;
// class NegativeException extends Exception
// {
//     public String toString()
//     {
//         return "Dimension never be negative.";
//     }
// }

class trycatchprac
{
    static int mtd1(int l, int b) throws Exception
    {
        if(l<0 || b<0)
            throw new Exception();
        return l*b;
    }

    static int mth2() throws Exception
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of l & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return mtd1(a,b);
    }

    static int mth3() throws Exception
    {
       return mth2();
    }

    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Area = " +mth3());
        }

        catch(Exception e)
        {
            System.out.println(e);
        }

    }

}
*/


class StackOverFlow extends Exception
{
    public String toString()
    {
        return "Stack is Full";
    }
}

class StackUnderFlow extends Exception
{
    public String toString()
    {
        return "Stack is Empty";
    }
}


class Stack
{
    private int size;
    private int top=-1;
    private int S[];
    
    public Stack(int sz)
    {
        size=sz;
        S=new int[sz];
    }
    
    public void push(int x) throws StackOverFlow
    {
        if(top==size-1)
        {
            throw new StackOverFlow();
        }

        else
        {
            top++;
          
        }

          S[top]=x;
    }
    
    public int pop() throws StackUnderFlow
    {
        int x=-1;
        
        if(top==-1)
            throw new StackUnderFlow();
        x=S[top];
        top--;
        return x;              
    }
}




public class trycatchprac 
{
    public static void main(String[] args) 
    {
        Stack st=new Stack(5);
        try
        {
        st.push(10);
        st.push(15);
        st.push(10);
        st.push(15);
        st.push(10);
      
        
        }
        catch(StackOverFlow s)
        {
            System.out.println(s);
        }
        
    }   
}


class Parent 
{
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public void publicMethod() {
        System.out.println("This is a public method in the Parent class");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method in the Parent class");
    }

    void defaultMethod() {
        System.out.println("This is a default method in the Parent class");
    }

    private void privateMethod() {
        System.out.println("This is a private method in the Parent class");
    }
}

class Child extends Parent {
    public void displayParentVariables() {
       
        System.out.println("Inherited publicVar: " + publicVar);
        System.out.println("Inherited protectedVar: " + protectedVar);
        System.out.println("Inherited defaultVar: " + defaultVar);

        
        // System.out.println("Inherited privateVar: " + privateVar);
    }

    public void displayParentMethods() {
     
        publicMethod();
        protectedMethod();
        defaultMethod();
        
        // privateMethod();
    }
}
