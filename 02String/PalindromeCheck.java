public class PalindromeCheck {

    public static boolean PalindromeCheckMethod(String s1){

        StringBuilder newStr = new StringBuilder(s1);

        newStr = newStr.reverse();

        return s1.equals(newStr);
        
    }
    
}
