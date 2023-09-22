class outer 
{
    int x = 50;

    class inner
    {
        int y=74;
        void display()
        {
            System.out.println("Value of x in inner = "+x);
            System.out.println("Value of y in inner = "+y);
        }
    }

    void outerdis()
    {
        inner d = new inner();
        d.display();
        System.out.println("Value of x in outer= "+x);
        System.out.println("Mission sussessful");
    }
}

class innerclassprac
{
    public static void main(String[] args) 
    {
   

        outer.inner m = new outer().new inner();
        m.display();
        
    }
}