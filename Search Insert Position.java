class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int n = nums.length;
        while(low<=high)
        {
            int middle = (low+high)/2;


            if(nums[middle] > target )
            {  
                //element not found 
                // When target is smaller than starting element of array
                // (Or) previous element is smaller and current element is larger than target
               if (middle == 0 || nums[middle-1] < target)
               {
                    return middle;
               }
               high = middle-1;

            }
            else if(nums[middle] < target)
            {
                // element not found and target is larger than last element
                if(middle == n-1)
                {
                    return middle+1;
                }
                low = middle+1;
            }
            else
            {
                return middle;
            }
        }
        return -1;
    }
}

