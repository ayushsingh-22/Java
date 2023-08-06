public class stuchallengestring2 
{
    public static void main(String[] args) 
    {
        String str = "    ayus123@$@%   @%23";
        String str2=str;
      
        System.out.println("Original String = "+str);
        System.out.println("Valid String = "+str.replaceAll("[^a-zA-Z0-9]",""));
        System.out.println("Removed Space string = "+str2.replaceAll(" ", "").trim());
    }    
}
