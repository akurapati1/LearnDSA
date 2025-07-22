import java.util.Arrays;

public class maxSumSubSequence {
    public int[] maxSubsequence(int[] nums, int k) {

       int[][] arr = new int[nums.length][2];

       for(int  i = 0; i<nums.length; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
       }
       
       Arrays.sort(arr, (a,b) -> b[0]-a[0]);
       Arrays.sort(arr, 0, k, (a,b) -> a[1] - b[1]);

       int[] res = new int[k];
       for(int i=0; i<k; i++){
        res[i] = arr[i][0];
       }

       return res;

    }
}
