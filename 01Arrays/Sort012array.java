public class  Sort012array{

    public void sort012(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        
        while(mid <= high){
            
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } 
            else if(arr[mid] == 1) mid++;
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                
                high--;
            } 
        }
    }
}
