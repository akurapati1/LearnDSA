

public class maxWaterinContainer {

    public int maxWater(int arr[]) {
        int maxArea = 0;
        
        int left =0; 
        int right = arr.length-1;
        
        while(left<=right){
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height*width;
            
            maxArea = Math.max(maxArea, area);
            
        
            if(arr[left] < arr[right]) left++;
            else right--;
        }
        
        return maxArea;
    }
    
}
