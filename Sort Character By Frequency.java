class Solution {
    public String frequencySort(String s) {
         PQueue pq = new PQueue();
        for(char c : s.toCharArray())
        {
           pq.insert(c);
        }

        StringBuilder str = new StringBuilder();
        while(!pq.isEmpty())
        {
           Element max =  pq.getMax();
            int freq = max.freq;
            while(freq>0)
            {
                str.append(max.ch);
                freq--;
            }
        }
        return str.toString();

    }
    class PQueue
    {
      Map<Character, Integer> map = new HashMap<>();

        void insert(char c)
        {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                 map.put(c,1);
            }

        }
        Element getMax()
        {
            char maxchar =' ';
            int maxfreq = 0;
             for(Character key : map.keySet())
            {
                 if(map.get(key)>maxfreq)
                 {
                     maxfreq = map.get(key);
                     maxchar = key;
                 }
             }

            map.remove(maxchar);
            return new Element(maxchar,maxfreq);
        }
        boolean isEmpty()
        {
            return map.isEmpty();
        }


    }
    class Element
    {
        public int freq;
        public char ch;
        Element(char c, int freq )
        {
            this.freq = freq;
            this.ch  = c;
        }
    }


}
