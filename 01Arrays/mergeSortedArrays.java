public class mergeSortedArrays {
    
    public static int[] merge(int[]arr1, int[]arr2){
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i< arr1.length && j< arr2.length){
            if(arr1[i] <= arr2[j]){
                result[k] = arr1[i];
                i++;
                k++;
            } 
            else{
                result[k] = arr2[j];
                k++;
                j++;
            }
        }
        if(i >= arr1.length){
            while(j < arr2.length){
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
        else{
            while(i < arr1.length){
                result[k] = arr2[i];
                i++;
                k++;
            }

        }

        return result;
    }
}
