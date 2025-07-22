
public class Fibonacci {


	public static void main(String[] args) {
		
		
		

		System.out.print(fibo(6));
		
	}

	public static int fibo(int n){
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(n == 2) return 1;

		int first =1;
		int second =1;
		int num =0;
		
		for(int i=3; i<=n; i++){

			num = first + second;
			first = second;
			second = num;
		}
		return num;
	}

}