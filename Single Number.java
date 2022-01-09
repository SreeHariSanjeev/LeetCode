class Solution {
    public int singleNumber(int[] nums) {
     //Using hashtable - Count the frequency of numbers if any key have frequency 1 then return
    // Using n*n approach, take first element search through entire array to check if element present. If element present move to next element and repeat the same process
        //Using XOR method, same elements cancel each other and we are left with single element
        int result = 0;
        for(int num : nums)
        {
            result = result^num;
        }
        return result;

    }
}
