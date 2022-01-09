class Solution 
{
public int[] sortedSquares(int[] nums)
{
    int[] result = new int[nums.length];
    int firstPositive = nums.length-1;
    // Traversing array to find first postive
    for(int i =0; i<nums.length; i++)
    {
            if(nums[i]>=0)
            {
                    firstPositive = i;
                    break;
            }
    }
    int rightPtr = firstPositive;
    int leftPtr = firstPositive -1;
    for(int i=0; i<nums.length; i++)
    {
            //Both left ptr and right ptr should be withing array range
            if(leftPtr >=0 && rightPtr < nums.length)
            {
                    int leftsq = nums[leftPtr]*nums[leftPtr];
                    int rightsq = nums[rightPtr]*nums[rightPtr];
                    Moving 
                    if(leftsq<rightsq)
                    {
                            result[i] = leftsq;
                            leftPtr--;
                    }
                    else
                    {
                            result[i] = rightsq;
                            rightPtr++;
                    }
            }
            // Left pointer reached end, so adding elements from right  ptr
            else if(rightPtr < nums.length)
            {
                    result[i] = nums[rightPtr] * nums[rightPtr];
                    rightPtr++;
            }
            //Right pointer reached end, so adding elements from left ptr
            else if(leftPtr >=0)
            {
                    result[i] = nums[leftPtr] * nums[leftPtr];
                    leftPtr--;
            }

    }
    return result;
}
}
