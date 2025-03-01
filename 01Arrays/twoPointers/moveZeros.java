class moveZeros {
    void pushZerosToEnd(int[] arr) {
        int left =0; 
        
        for(int i=0; i< arr.length; i++){
            
            if(arr[i]!=0){
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i]=temp;
                left++;
            }
        }
            
            
    }
}