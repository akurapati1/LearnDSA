class ReverseAstring{
    
    public static String reverseStringwithSB(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static String reverseStringwithoutSB(String s){
        String result = "";
        for(int i = s.length()-1; i>=0; i--){
            result+=s.charAt(i);
        }

        return result;
    }
    
}