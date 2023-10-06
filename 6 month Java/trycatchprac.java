import java.util.Scanner;

class trycatchprac 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int a=10;
    System.out.print("Enter value of b = ");
    int b = sc.nextInt();

    try
    {
      int c = a/b;
      System.out.println("Answer aagya");
    }

    // catch(ArithmeticException e)
    // {
    //   System.out.println("Error ----> " +e.getMessage());
    // }

    catch(ArithmeticException e)
    {
      System.out.println("Error ----> " +e);
    }

  }
}