class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        //distinct count of characters must be 1
        //greater any element occurs second time strink window size
        Map<Character,Integer> map = new HashMap<>();
        int result = 0;
        int windowStart = 0, windowEnd = 0;
        for(int i = 0; i < s.length(); i++,windowEnd++)
        {
             char ch = s.charAt(i);
             if(map.containsKey(ch))
             {
                 /** Tricky part, Ex: "abba" when loop reaches last element. windowStart = 2 but map.get('a') = 1 which is lesser than windowStart. So we cannot change windowStart = 1. It is like increasing window Size **/ 

                 int index = map.get(ch) +1;
                 if(index > windowStart)
                    windowStart = index;  

             }
             map.put(ch,i);
            result = Math.max(result,windowEnd-windowStart+1);
            System.out.println(result);
        }

        return result;

    }
}
