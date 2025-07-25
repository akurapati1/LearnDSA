public class linearSearch {
    
    public static int linear(int[] arr, int k){

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == k) return i;
        }

        return -1;

    }
}
