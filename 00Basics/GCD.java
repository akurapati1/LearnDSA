public class GCD {

    public static int gcdOf(int a, int b){
        
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    
}
