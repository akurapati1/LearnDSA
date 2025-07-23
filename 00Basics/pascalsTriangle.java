public class pascalsTriangle {
    
    public static void pascal(int n){
	    int[] prev = new int[n];
        for(int i = 0; i<n; i++){
            
            for(int j = n-1; j>=i; j--){
                System.out.print(" ");
            }
            
            
            int[] current = new int[n];
            
            for(int j = 0; j<=i; j++){

                if(j ==0 || j == i){

                    System.out.print(1+" ");
                    current[j] =1;
                } 
                else{
                    current[j] = prev[j-1]+prev[j];
                    System.out.print(current[j] +" ");
                    
                }

            }
            
            prev = current;
            
            
            System.out.println();
            
        }
        
       
    }
}
