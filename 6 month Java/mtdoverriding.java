class teacher
{
    public void add()
    {
        System.out.println("aaj add karna learn karenga");
        System.out.println();
    }
}

class update extends teacher
{
    public void addmtd(int a, int b)
    {
        int c = a+b;
        System.out.printf("Add of %d & %d = %d",a,b,c);
        System.out.println();
    }
}


public class mtdoverriding 
{
    public static void main(String[] args) 
    {
        teacher tc = new teacher();
        tc.add();

        update up = new update();
        up.addmtd(115,1115);
    }
}
