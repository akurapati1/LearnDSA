public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        
        int large = Integer.MIN_VALUE;
        int second_large = large;
        
        for(int i=0; i<arr.length; i++){
            
            if(arr[i]>large){
                second_large = large;
                large = arr[i];
                continue;
            }
            if(arr[i]>second_large && arr[i]<large){
                second_large = arr[i];
            }
            
        }
        if(second_large == Integer.MIN_VALUE) return -1;
        return second_large;
        
    }
    
}
