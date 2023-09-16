abstract class superr
{
    public superr()
    {
        System.out.println();
        System.out.println("Super constructor");
    } 

    void mtd1()
    {
        System.out.println("Calling mth1.");
    }

    abstract void mtd2();

}

class sub extends superr
{
    public void mtd2()
    {
        System.out.println("Over take abstract method");
        System.out.println();
    }
}

public class abstractprac 
{
    public static void main(String[] args) 
    {
        superr sc = new sub();
        sc.mtd1();
        sc.mtd2();
    }    
}
