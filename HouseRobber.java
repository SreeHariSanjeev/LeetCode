class Solution {
    public int rob(int[] nums) {
        
        int len = nums.length;
        
        if(len == 1)
            return nums[0];
        
        int max =  Math.max(nums[0],nums[1]);
        
        if(len == 2)
        {
            return max;
        }
        
        //mem stores maxamount robbed till that index
        int mem[] = new int[len];
        mem[0] = nums[0];
        mem[1] = max;   
        
        for(int i = 2; i<len; i++)
        {
            System.out.println(max);
            mem[i] = Math.max(mem[i-2]+nums[i],max);
            
            if(mem[i] > max)
            {
                max = mem[i];
            }
        }
      
        return max;
        
    }
}
