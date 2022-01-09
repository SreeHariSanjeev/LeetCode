class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        Set<Integer> pParents = new HashSet<Integer>();
        find(root,p.val,pParents);
        // for(Integer parent: pParents)
        // {
        //     System.out.println(parent);
        // }
        TreeNode Least = findLeast(root, q.val, pParents,root);
        return Least;
    }
    void find(TreeNode root,int value,Set<Integer> parents)
    {
        if(root != null)
        {
            parents.add(root.val);

            if(root.val == value)
            {
                return;
            }
            else if(root.val < value)
            {

                find(root.right, value, parents);
            }
            else if(root.val > value)
            {
                find(root.left, value, parents);
            }
        }
    }
    TreeNode findLeast(TreeNode root, int value, Set<Integer> parents, TreeNode Least)
    {

        if(root != null)
        {
            if(parents.contains(root.val))
            {
                System.out.println("Least :"+root.val);
                Least = root;
            }
            if(root.val == value)
            {
                return Least;
            }
            else if(root.val < value)
            {
                Least = findLeast(root.right, value, parents, Least);
            }
            else if(root.val > value)
            {
               Least =  findLeast(root.left, value, parents, Least);
            }
        }
        return Least;
    }
}
