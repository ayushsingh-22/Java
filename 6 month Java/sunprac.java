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
    static atm am = new atm();
    detail(String n, int a)
    {
        name = n;
        amount = a;
    }

    public void useATM()
    { 
        am.checkBalance(name);
        am.withdrawl(name, amount);
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
        detail dt1 = new detail("ayush", 2500);
        dt1.start();
        detail dt2 = new detail("Ravan", 500);
        dt2.start();
    }
}
