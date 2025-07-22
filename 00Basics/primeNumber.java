public class primeNumber {
    public static boolean isPrime(double n){
        if(n == 1) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i == 0 && n!=2) return false;
        }

        return true;
    }
}
