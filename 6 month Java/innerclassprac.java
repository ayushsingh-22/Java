// nested inner class

/*
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
    //     outer os = new outer();
    //     os.outerdis();

        outer.inner m = new outer().new inner();
        m.display();
        
    }
}
*/


/*
class fun
{
    class sad
    {
        void soon()
        {
             System.out.print("Aayai start karta hai!!!!  --> ");
            for(int i=0;i<4;i++)
            {
                System.out.print(i);
            }

            System.out.println();
            System.out.println("Pta nahi kuch to error hai upper mai");
            System.out.println("Bilkul sahi baat hai");
        }
    }
}

class innerclassprac
{
    public static void main(String[] args) 
    {
        fun.sad f=new fun().new sad();
        f.soon();
        
    }
}
*/

// local inner class 

/* 
class gun
{
    void price()
    { 
        int x=50;
        class typee
        {
            void printt()
            {
                System.out.println("Yaha par type of gun pta chlta hai ------> "+x);
            }
            
        }
        typee pp = new typee();
        pp.printt();
    }

}

class innerclassprac
{
    public static void main(String[] args) 
    {
        gun gg = new gun();
        gg.price();
    }
}
*/

// anonymous class 

/* 
interface gun 
{
    void typee();
}

class innerclassprac
{
    public static void main(String[] args) 
    {
        gun gg = new gun() 
        {
            public void typee()
            {
                System.out.println("Ya par method override karna jaruri hai; Pta hana!!!");
            }
        };

        gg.typee();
    }
}
*/
/* 
abstract class fun
{
    abstract void mojj();
}

class innerclassprac
{
    public static void main(String[] args) 
    {
        fun ff = new fun() 
        {
            public void mojj()
            {
                System.out.println("Same logic abstract class ka liya bhi hota hai. ");
                System.out.println("Pta too hoga hi!!!");
            }
        };

        ff.mojj();
    }
}
*/

//  static inner class

class sleep
{
    int x=20;
    static int y=30;

    static class dream
    {
        void dursleep()
        {
            System.out.println();
            System.out.println("Sona ka baad mast SAPNA aata hai !!!! ---> " +y);
            System.out.println();
        }
    }
}

class innerclassprac
{
    public static void main(String[] args) 
    {
        sleep.dream sd = new sleep.dream();
        sd.dursleep();
        
    }
}
