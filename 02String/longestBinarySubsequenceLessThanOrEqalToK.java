public class longestBinarySubsequenceLessThanOrEqalToK {

    public int longestSubsequence(String s, int k) {
        
        int count = 0;
        int value = 0;
        int power = 0;

        for(char c: s.toCharArray()){
            if(c == '0') count++;
        }

        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == '1'){
                value += Math.pow(2,power);

                if(value <= k) count ++;
                else return count;
            }

            power++;

        }

        return count;
        
    }
    
}
