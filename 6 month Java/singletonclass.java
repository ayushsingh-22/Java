class Singleton 
{
    private static Singleton instance;

    private Singleton() {}
    public static Singleton getInstance() 
    {
        if (instance == null) 
        {
            instance = new Singleton();
        }
        return instance;
    }
}


public class singletonclass {
    public static void main(String[] args) 
    {
       
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) 
        {
            System.out.println("Both instances are the same. Singleton works!");
        } 
        else
        {
            System.out.println("Singleton failed!");
        }

    }
}

