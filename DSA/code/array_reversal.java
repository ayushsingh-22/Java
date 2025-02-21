public class array_reversal 
{
    public static void main(String[] args){
    int A[] = {10, 20, 30, 40, 50,60};
    int temp;
    int end = A.length - 1;
    

    for(int i=0;i<A.length/2;i++)
    {
        temp = A[end];
        A[end] = A[i];
        A[i] = temp;
        end--;
        
    }

    for (int i : A) {
        System.out.println(i);
    }
}
    
}
