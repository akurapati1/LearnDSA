

import java.util.Arrays;

public class mberofSubSequenceThatSatisfyTheSumTarget {
    public int numSubseq(int[] nums, int target) {
        int mod = 1_000_000_007;
        int count =0;
        int[] power = new int[nums.length];

        power[0] = 1;

        for(int i = 1; i<nums.length; i++){
            power[i] = (power[i-1]*2) % mod;
        }
        
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            if(nums[left] + nums[right] <= target){
                count = (count + power[right-left]) % mod;
                left++;
            }
            else{
                right--;
            }
            
        }

        return count;



        
    }

}
