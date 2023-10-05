class ListOfNumbers {
  public int[] arr = new int[10];

  public void writeList() {

    try {
      arr[10] = 11;
    }
    
    // catch (Exception e1) {
    //   System.out.println("NumberFormatException => " + e1);
    // }
    
    catch (Exception e2) {
      System.out.println("IndexOutOfBoundsException => " );
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