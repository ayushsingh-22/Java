/* 

class parent
{
    int x=10;

    void display()
    {System.out.println("Unparamaterized constructor.");}
}

class child extends parent
{
    int x=202;

    void display()
    {
        System.out.println("print karna hai = ");
        System.out.println("child hai kya = "+x);
        System.out.println("Iska kya hoga = "+super.x);
        super.display();
    }
}

public class supervsthis 
{
    public static void main(String[] args) 
    {
        child ch=new child();
        ch.display();
        
    }
    
}

*/

class parent
{
    public parent()
    {
        System.out.println("Unparametrized constructor");
    }

    public parent(int x)
    {
        System.out.println("Pramaterixed constructor = "+x);
    }
}

class child extends parent
{
    public child()
    {
        System.out.println("Child class hai ");
    }

    public child(int x,int y)
    {
        super(x);
        System.out.println("child class with data = "+y);
    }
}

class supervsthis
{
    public static void main(String[] args) 
    {
        child ch = new child(20,50);
    }
}