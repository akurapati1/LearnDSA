import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicates {
    
    public static void main(String[] args){
        Integer[] arr = {11,1,11,1,1,2,11,11,1,2,33,33,44,1,2,11,2};
        HashSet<Integer> hashset = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            hashset.add(arr[i]);
        }

        arr = new Integer[hashset.size()];
        hashset.toArray(arr);

        System.out.println(Arrays.toString(arr));


    }
}
