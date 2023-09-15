class superr
{
    public void mth1()
    {System.out.println("Super class mth1");}

    public void mth2()
    {System.out.println("Super class mth2");}

}

class sub extends superr
{
    public void mth2()
    {System.out.println("Super class sub mth2");}

    public void mtd3()
    {System.out.println("Super class mth1");}

}

class dynamicmtddispatch
{
    public static void main(String[] args) 
    {
        superr sp = new sub();

        System.out.println();
        sp.mth1();
        sp.mth2();
        System.out.println();
        
    }
}