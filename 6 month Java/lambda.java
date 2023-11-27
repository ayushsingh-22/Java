// Lambda without parameter

/*
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
*/

// Lambda with parameter

interface fun
{
    public int nature(int x, int y);
}

public class lambda 
{
    public static void main(String[] args) 
    {
        fun ff = (a,b)-> a+b; 
        // {
        //     int c=a+b;
        //     System.out.println(c);
        // };

        System.out.println(ff.nature(45,5));  
    }
}