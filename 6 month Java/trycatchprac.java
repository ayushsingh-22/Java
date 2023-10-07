class trycatchprac
{
    static int mtd1(int l, int b) throws Exception
    {
        if(l<0 || b<0)
            throw new Exception();
        return l*b;
    }

    static int mth2()
    {
        try
        {
            return mtd1(5,10);
        }

        catch(Exception e)
        {
            System.out.println(e);
            return 0;
        }
    }

    static int mth3()
    {
       return mth2();
    }

    public static void main(String[] args) 
    {
        System.out.println("Area = " +mth3());

    }

}