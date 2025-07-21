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

    

    }
}
