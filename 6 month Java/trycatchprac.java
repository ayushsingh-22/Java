class ListOfNumbers {
  public int[] arr = new int[10];

  public void writeList() {

    try {
      arr[9] = p;
    }
    
    catch (Exception e1) {
      System.out.println("NumberFormatException => " + e1);
    }
    
    // catch (Exception e2) {
    //   System.out.println("IndexOutOfBoundsException => " + e2);
    // }

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