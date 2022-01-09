class Solution {
    public boolean findTarget(TreeNode root, int k) {
        boolean found = false;
        Set<Integer> set = new HashSet<>();
        return find(root,k,found,set);

    }
    boolean find(TreeNode root, int k , boolean found, Set<Integer> set)
    {
        if(root != null && found == false)
        {
            int find = k - root.val;
            System.out.println("Find: "+find +"Current :"+root.val);
            if( set.contains(find)  )
            {
                System.out.println("Found");
                found  = true;
                return found;
            }

            set.add(root.val);

            found =  find(root.left, k, found, set);   
            found = find(root.right,k, found, set);

        }
        return found;
    }
}
