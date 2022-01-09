class Solution {


    public List<String> letterCasePermutation(String s) {

        List<String> result = new ArrayList<String>();

        permute(result,0,s.toCharArray());

        return result;
    }

    /*dfs appraoch. Visualize like tree


           a1b2
           /   \
       A1b2     a1b2
        / \      /  \
     A1B2  A1b2 a1B2  a1b2

     all the leaf nodes are answer
     */


    void permute(List<String> result, int index, char[] s)
    {
        if(index == s.length)
        {
            System.out.println(s);
            String str = new String(s);
            result.add(str);
            return;
        }
        if(!Character.isDigit(s[index]))
        {
            //Each character have two different combination 1) Lower Case 2) Upper Case
            //After changing particular index move to next index
            s[index] = Character.toUpperCase(s[index]);
            permute(result,index+1,s);

            s[index] = Character.toLowerCase(s[index]);
            permute(result,index+1,s);
        }
        else
        {
            permute(result,index+1,s);
        }
    }
}
