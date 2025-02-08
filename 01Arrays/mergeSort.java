public class mergeSort {

    void sort(int arr[], int l, int r) {
        
        if(l < r){
            int mid = l+(r-l)/2;
            sort(arr, l, mid);
            sort(arr, mid+1, r);
            merge(arr, mid, l,  r);
        }
       
    }
    
   
    
    void merge(int arr[], int mid, int l, int r){
        
        int sorted[] = new int[r-l+1];
        
        int k = 0;
        int i = l;
        int j = mid+1;
        
        while(i <= mid  && j <= r){
            if(arr[i] <= arr[j]){
                sorted[k] = arr[i];
                i++;
                k++;
            }
            else{
                sorted[k] = arr[j];
                j++;
                k++;
            }
        }
        
        if(i>mid){
            while(j <= r){
                sorted[k] = arr[j];
                k++;
                j++;
            }
        }
        
        else{
            while(j <= r){
                sorted[k] = arr[i];
                k++;
                i++;
            }
        }
        
        for(int e = 0; e<sorted.length; e++){
            arr[l+e] = sorted[e];
        }
        
        
        
    }
}