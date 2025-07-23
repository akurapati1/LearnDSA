import java.util.Arrays;
//only for small case letters

public class Anagrams{

    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length()) return false;

        char[] aChars = new char[26];
        char[] bChars = new char[26];

        for(char c: a.toCharArray()){

            aChars[c - 'a']++;
        }

        for(char c: b.toCharArray()){

            bChars[c - 'a']++;
        }

        return Arrays.equals(aChars, bChars);

    }
}