interface test
{
    void mtd1();
    void mtd2();
}

class my implements test
{
    public void mtd1()
    {
        System.out.println("Method 1 ha kya.....");
    }
}

class interfaceprac
{
    public static void main(String[] args) 
    {
        my m = new my();
        m.mtd1();
        m.mtd2();
        
    }
}