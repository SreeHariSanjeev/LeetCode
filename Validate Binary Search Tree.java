class Solution {
    public boolean isValidBST(TreeNode root) {
        MyBoolean isbst  = new MyBoolean(true);
        return isValid(TreeNode root, isbst, null );



       /* Without MyBoolean Approach
        boolean isBst = true;
        if(root != null)
        {
            if(root.left != null && root.val <= root.left.val)
            {
                System.out.println("false");
                isBst = false;
            }
            else if(root.right != null && root.val >= root.right.val)
            {
                System.out.println("false");
                isBst = false;
            }
            else{
                isBst = isValidBST(root.left);
                isBst = isValidBST(root.right);
            }

        }
        return isBst;*/
    }
    TreeNode isValid(TreeNode root, MyBoolean isBst, TreeNode parent)
    {
        if(root!= null)
        {
            if(root.left == null && root.right == null)
            {
                return root;
            }
            else
            {

                TreeeNode previous = isValid(root.left, isBst);
                if(previous != null && previous.val > root.val)
                {
                    isBst.val = false;
                }
                isValid(root.right,isBst);

            }
        }
    }
    class MyBoolean
    {
        boolean val;

        MyBoolean(boolean val)
        {
            this.val = val;
        }
    }
}
