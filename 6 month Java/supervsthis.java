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
