import java.util.ArrayList;
import java.util.List;

class Solution {
    // Function to find factorial numbers less than or equal to N.
    public List<Long> factorialNumbers(long N) {
        List<Long> ans = new ArrayList<>();
        long fact = 1;
        int x = 2;

        // Iterating until factorial is less than or equal to N.
        while (fact <= N) {
            // Adding factorial to the answer list.
            ans.add(fact);

            // Calculating next factorial by multiplying with the next number.
            fact = fact * x;
            x++;
        }
        // Returning the list of factorial numbers.
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long N = 100; // Example input
        List<Long> result = solution.factorialNumbers(N);
        System.out.println("Factorial numbers less than or equal to " + N + ": " + result);
    }
}
