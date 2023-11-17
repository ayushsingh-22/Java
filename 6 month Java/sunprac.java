class atm
{
    synchronized void checkBalance(String name)
    {
        System.out.println(name + " checking balance" );
    }

    synchronized void withdrawl(String name, int amount)
    {
        System.out.println(name + " withdraw " + amount);
    }
}

class detail extends Thread
{
    String name;
    int amount;
    atm aa;
    
    detail(String n,atm ai, int a)
    {
        name = n;
        amount = a;
        aa = ai;
    }

    public void useATM()
    { 
        aa.checkBalance(name);
        aa.withdrawl(name, amount);
    }
    public void run()
    {
        
       useATM();
    }    
}

public class sunprac 
{
    public static void main(String args[])
    {
        atm am = new atm();
        detail dt1 = new detail("ayush",am, 2500);
        dt1.start();
        detail dt2 = new detail("Ramu",am, 500);
        dt2.start();
    }
}
