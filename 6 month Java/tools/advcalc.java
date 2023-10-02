package tools;

public class advcalc extends calc
{
    public double power(int a, int b)
    {
        return Math.pow(a, b);
    }

    public int min(int a, int b)
    {
        return (int)Math.min(a, b);
    }

    public int max(int a, int b)
    {
        return (int)Math.max(a, b);
    }
    
    public double rem(int a, int b)
    {
        if(b>0)
        {
            if(a%b==0)
            {
                System.out.println("Quotient of "+ a +" when divided by "+b+" = " +(a/b));
                return a%b;
            }

            else 
            {
                return a%b;
            }
        }  
            
        else
        {
            return 0;
        }
        
    }
}
