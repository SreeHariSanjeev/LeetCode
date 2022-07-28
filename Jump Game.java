class Solution {
    public boolean canJump(int[] nums) {
        
        boolean[] visited = new boolean[nums.length];
       return jump(0,nums,visited);
        
    }
    boolean jump(int index,int[] nums,boolean[] visited)
    {
        //Return true if we can reach the last position.  
        if(index >= nums.length-1)
            return true;
        
        //Already visited this index means. last position is not reachable from this position
       if(visited[index] == true)
       {
         return false;  
       } 
        
        //mark as visited
        visited[index] = true;    
        
        int currValue = nums[index];
        boolean ret = false;
        
        //Check all the possible jump from current value (Ex: value=3, jump=3,2,1)
        for(int val = currValue; val>0; val--)
        {
            
            ret = jump(index+val,nums,visited);
            //return will be overrided in next iteration so return once it is true
            if(ret == true)
            {
                return ret;
            }
        }
        return ret;
    }
}
