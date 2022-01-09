class Solution 
{
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) 
    {

        return merge(root1,root2);
        //return result;
    }
    TreeNode merge(TreeNode root1, TreeNode root2)
    {
        TreeNode result = null;
        if(root1 != null && root2 != null)
        {


            result = new TreeNode(root1.val+root2.val);
            //System.out.println("two node "+ result.val);
            result.left = merge(root1.left, root2.left);
            result.right = merge(root1.right, root2.right);
        }
        else if(root1 != null)
        {

            result = new TreeNode(root1.val);
            //System.out.println("Root1 "+result.val);
            result.left = merge(root1.left, null);
            result.right = merge(root1.right, null);
        }
        else if(root2 != null)
        {
            result = new TreeNode(root2.val);
            //System.out.println("Root2 "+result.val);
            result.left = merge(null, root2.left);
            result.right = merge(null, root2.right);
        }


        return result;
    }
}
