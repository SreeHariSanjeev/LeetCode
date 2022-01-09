class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        permute(result,list,nums);

        return result;
    }
    //Backtracking approach
    void permute(List<List<Integer>>  result, List<Integer> list, int[]nums)
    {
        if(list.size() == nums.length)
        {
            List<Integer> newls = new ArrayList<>(list); //creating a new list because items will be removed from this list during backtracking
            result.add(newls);   
        }
        for(int i = 0; i<nums.length; i++)
        {
            if(list.contains(nums[i]))
                continue;

            list.add(nums[i]);

            permute(result,list,nums);

            list.remove(list.size()-1);

        }
    }
}
