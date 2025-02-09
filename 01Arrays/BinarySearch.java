class BinarySearch {
    public int binarysearch(int[] arr, int k) {
        
        int lb = 0;
        int ub = arr.length-1;
        return search(arr, lb, ub, k);
        
    }
    
    public int search(int[] arr, int lb, int ub, int k){
        
        if(lb > ub) return -1;
        
        int mid = lb +(ub - lb)/2;
        
        if(arr[mid] == k){
            
            if(mid ==0 || arr[mid-1] !=k) return mid;
            else return search(arr, lb, mid, k);
        } 
        
        else if(arr[mid]> k) return search(arr, lb, mid-1, k);
        
        else return search(arr, mid+1, ub, k);
        
        
    }
}