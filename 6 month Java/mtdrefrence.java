// method referncing in java with static method.

/* 
interface fun
{
    public void demo();
}

class gun 
{
    public static void mydemo()
    {
        System.out.println("Printing in satatic method....... Print ");
    }
}

public class mtdrefrence 
{
    public static void main(String[] args) {
        fun f = gun::mydemo;
        f.demo();
    }
}
*/

// method referncing in java without static method.

interface fun
{
    public void demo();
}

class gun 
{
    public  void mydemo()
    {
        System.out.println("Printing in non-satatic method....... Print ");
    }
}

public class mtdrefrence 
{
    public static void main(String[] args) {
        gun g=new gun();
        fun f = g::mydemo;
        f.demo();
        System.out.println();
    }
}