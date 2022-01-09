

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1len = s1.length();
        int s2len = s2.length();
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> frequencyMap = new HashMap<>();

        if(s1len > s2len)
        {
            return false;
        }
        for(int i=0; i<s1len; i++)
            frequencyMap.put(s1.charAt(i),frequencyMap.getOrDefault(s1.charAt(i),0)+1);


        int count = 0;

        for(int i =0; i<s1len; i++)
        {
            char ch = s2.charAt(i);
            if(frequencyMap.containsKey(ch))
            {
                map.put(ch,map.getOrDefault(ch,0)+1);

                if(frequencyMap.get(ch) >= map.get(ch))
                {
                    count++;
                }
            }
        }


        for(int i = s1len, windowStart = 0, windowEnd = s1len; i<s2len; i++,windowStart++,windowEnd++)
        {

            if(count == s1len)
            {
                return true;
            }

            char start = s2.charAt(windowStart);
            char end = s2.charAt(windowEnd);



            if(frequencyMap.containsKey(start))
            {

                map.put(start,map.getOrDefault(start,0)-1);

                if(frequencyMap.get(start) > map.get(start))
                {
                    count--;
                }
            }

            if(frequencyMap.containsKey(end))
            {
                map.put(end,map.getOrDefault(end,0)+1);

                if(frequencyMap.get(end) >= map.get(end))
                {
                    count++;
                }
            }

        }

        return count == s1len;

    }
}
