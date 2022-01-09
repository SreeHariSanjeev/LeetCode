class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        combination(n,1,k,list,result);

        return result;
    }
    void combination(int n, int index, int k,List<Integer> list, List<List<Integer>> result )
    {
        //No. of elements in combination reached k
        if(list.size() == k)
        {
            List<Integer> newls = new ArrayList<>(list);

            result.add(newls);
            return;
        }

        //Start from right of previous index because in combination array element order cannot be changed. Combination should be from left to right

        for(int i = index; i<=n; i++)
        {
            list.add(i);

            combination(n,i+1,k,list,result);

            list.remove(new Integer(i));
        }

    }
}
