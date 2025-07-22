public class quickSort {
    static void quick(int arr[], int low, int high) {
        if(low<high){
            int mid = partition(arr, low, high);
            quick(arr, low, mid-1);
            quick(arr, mid+1, high);
        }
        
    }

    static int partition(int arr[], int low, int high) {

        int pivot = low;
        int left = low+1;
        int right = high;

        while(left <= right){
            while( left <= high && arr[left] <= arr[pivot]){

                left ++;
            
            }
            while(right >= low && arr[right] > arr[pivot]){
                right--;
            }
            if(left<right){
                
                int temp = arr[left];
                arr[left]= arr[right];
                arr[right] = temp;
                
            }
            
            
        }
        int temp = arr[pivot];
        arr[pivot]= arr[right];
        arr[right] = temp;
        
        return right;
        
        
        
    }
    
}
