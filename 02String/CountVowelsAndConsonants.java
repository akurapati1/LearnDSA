import java.util.HashMap;

public class CountVowelsAndConsonants {
    
    public static HashMap<String, Integer> countVandC(String s){
        HashMap<String, Integer> result = new HashMap<>();
        result.put("Vowels", 0);
        result.put("Consonants", 0);

        for(char c: s.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1)
            {
                result.put("Vowels", result.get("Vowels")+1);
            } 
            else if(Character.isLetter(c)){
                result.put("Consonants", result.get("Consonants")+1);
            }
        }
        return result;
    }
}
