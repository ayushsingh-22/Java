import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class factorial {

    public static void main(String[] args) 
    {
        Scanner SC = new Scanner(System.in);
        long N = SC.nextInt(); 
        List<Long> result = new ArrayList<>();
        findFactorialNumbers(1, 2, N, result);
        System.out.println("Factorial numbers less than or equal to " + N + ": " + result);
    }

    public static void findFactorialNumbers(long fact, int x, long N, List<Long> ans) 
    {
        if (fact > N) {
            return;
        }
        
        ans.add(fact);
        findFactorialNumbers(fact * x, x + 1, N, ans);
    }
}
