public class FibonacciSeries {
    
    public static int fibonacciUsingRecusion(int n){

        if(n == 0) return 0;
        
        else if(n == 1) return 1;
        
        else return  fibonacciUsingRecusion(n-1)+fibonacciUsingRecusion(n-2);
    
    }

    public static void printFibo(int n){
        for(int i = 0; i<n; i++){
            System.out.println(fibonacciUsingRecusion(i));
        }
    }

    public static void fibonacciWithoutRecursion(int n){

        if(n<=1){
            System.out.println(n);
            return;
        } 

        int first = 0;
        int second =1;

        for(int i = 2; i<n; i++){

            int temp = first+second;

            System.out.println(temp);

            first = second;
            second = temp;

        }

    }

    public static int fibonacciWithDP(int n, int[] fibo){

        if(n<=1) return n;
        if(fibo[n] == 0){

            fibo[n] = fibonacciWithDP(n-1, fibo)+ fibonacciWithDP(n-2, fibo);
            
        }
        return fibo[n];
    }
}
