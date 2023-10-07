class trycatchprac
{
    static int mtd1(int l, int b)
    {
        return l*b;
    }

    static int mth2()
    {
        return mtd1(5,10);
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