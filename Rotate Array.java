class Solution {
    public void rotate(int[] nums, int k)
    {
        int start = 0,n = nums.length;
        k = k%n; // If k size is larger than n, take modulus so it doesn't go out of bound

        if(n<=1)
            return;

        reverse(0,n-1, nums); // Reverse whole array
        reverse(0,k-1,nums); // Reverse First half
        reverse(k,n-1,nums); // Reverse Second half

    }

    void reverse(int start, int end, int[] nums)
    {
        System.out.println(start+" "+end);
        while(start<end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
