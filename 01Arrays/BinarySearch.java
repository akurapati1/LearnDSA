class BinarySearch {
    public int binarysearch(int[] arr, int k) {
        
        int lb = 0;
        int ub = arr.length-1;
        return search(arr, lb, ub, k);
        
    }
    
    public int search(int[] arr, int lb, int ub, int k){
        
        if(lb == ub && arr[lb] ==k) return lb;
        
        if(lb < ub){
            int mid = (lb+ub)/2;
            if(arr[mid] < k){
                return search(arr, mid+1, ub, k);
            } 
            else if(arr[mid] > k) {
                return search(arr, lb, mid-1, k);
            }
            else return mid;
        }
        
        return -1;
        
        
    }
}