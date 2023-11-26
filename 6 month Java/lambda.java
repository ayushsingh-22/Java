interface Mylambda
{
    void fun();
}

public class lambda 
{
    public static void main(String[] args) 
    {
        Mylambda ml = ()->
        {
            System.out.println("My name is Raja Babu");
        };

        ml.fun();
        
    }
}
