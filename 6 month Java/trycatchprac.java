class ListOfNumbers {
  public int[] arr = new int[10];

  public void writeList() {

    try {
      arr[10] = 11;
    }
    
    catch (NumberFormatException e1) 
    {
        System.out.println();
        System.out.println("NumberFormatException => " + e1.getMessage());
    }
    
    catch (IndexOutOfBoundsException e2) 
    {
        System.out.println();
        System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
    }

    finally
    {
        System.out.println();
        System.out.println("Agar ab error pta chl gya hai to sahi kar lai!!!!");
    }

  }
}

class trycatchprac 
{
  public static void main(String[] args) 
  {
    ListOfNumbers list = new ListOfNumbers();
    list.writeList();
  }
}