import java.util.*;

public class palindrom_string 
{
    public static void main(String[] args) 
    {
        String a = "A man, a plan, a canal: Panama";

        int start = 0;
        int last = a.length() - 1;
        
        System.out.println(a.length() + ","+start + ","+last);
        System.out.println( isPalindrome(a));
    }

    /*
    public static  boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) 
        {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);

        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	}
            
            else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} 
            
            else 
            {
        		if (Character.toLowerCase(currFirst) == Character.toLowerCase(currLast)) 
                {
        			start++;
        		last--;
        		}
        		
        	}
        }
        return false;
    }
    */

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        for (char c : s.toCharArray()) {
            if (s=="[a-z0-9]") {

                int left = 0;
                int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
       
            }

            else if(s=="[a-z]" )
            {
                int left = 0;
                int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
            }

            else if(s=="[0-9]" )
            {
                int left = 0;
                int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
            }
        }

        return true;
        
    }
}
