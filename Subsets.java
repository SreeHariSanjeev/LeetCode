class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       
        int k = nums.length;
        
        List<List<Integer>> result = new ArrayList<>();
        //Find subsets of all the sizes Ex: k = 3 means find subsets with size = 0,1,2,3
        for(int i = 0; i<=k; i++)
        {
            List<Integer> list = new ArrayList<>();
            subset(nums,i,result,list,0);
        }
        return result;
    }
    
    //Subsets maintains the order of array
    // add elements from the start and ignore previous elements
    //
    void subset(int[] nums,int subsetSize, List<List<Integer>> result, List<Integer> list,int start)
    {
        if(list.size()  == subsetSize)
        {
            List<Integer> newlist = new ArrayList<>(list);
            result.add(newlist);
        }
        
        for(int i=start; i<nums.length; i++)
        {
            list.add(nums[i]);
            subset(nums,subsetSize,result,list,i+1);
            list.remove(list.size()-1);  //remove previous element/Backtracking
        }
        
    }
}

/*
k=2  list=[]
subset(size=2,start=0)
1) start = 0  then  add 1 to list[1]
2) start = 1 then add 2 to list[1,2] => subset size reached so add to result
3) start = 2 then add 3 list[1,3]  => result
subset(size=2,start=1)
start = 1 & list[2]
start = 2 & list[2,3]  => result
*/


