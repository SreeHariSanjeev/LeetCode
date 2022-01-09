class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<String>();

        StrComp comparator = new StrComp();
         PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<Map.Entry<String, Integer>>(comparator);


        Map<String,Integer> map = new HashMap();
        for(String word : words)
        {
           map.put(word,map.getOrDefault(word,0)+1);
        }
        for(Map.Entry<String, Integer> pair : map.entrySet())
        {
            pq.offer(pair);
        }
        for(int i = 0; i<k; i++)
        {
             result.add(pq.poll().getKey());
        }

        return result;

    }
}
class StrComp implements Comparator
{
    @Override
    public int compare(Object o1,Object o2)
    {  

        Map.Entry<String,Integer> p1 = (Map.Entry)o1;
        Map.Entry<String,Integer> p2 = (Map.Entry)o2;

        if(p1.getValue().equals(p2.getValue()))
        {
           return p1.getKey().compareTo(p2.getKey());
        }
        else
        {
           return p2.getValue() - p1.getValue(); 
        }

    }
}
