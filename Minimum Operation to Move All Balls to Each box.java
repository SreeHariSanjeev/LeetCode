class Solution {
    public int[] minOperations(String boxes) {
        char[] arr = boxes.toCharArray();
        int[] result = new int[arr.length];
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr.length; j++)
            {
                if(i!=j && arr[j] == '1' )
                {
                    result[i] += Math.abs(i-j);
                }
            }
        }
        return result;
    }
}
