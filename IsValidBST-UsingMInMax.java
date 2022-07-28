class Solution {
    public boolean isValidBST(TreeNode root) {
        
        return isValid(root,null,null );
        
    }
    boolean isValid(TreeNode root, Integer min, Integer max)
    {
        if(root == null)
            return true;
        
        if( (min != null && root.val <= min) || (max != null && root.val >= max) )
           return false;
        
        //When we go left side max gets updated. All the left side nodes must be lesser than current node (max)
        //When we go right side min gets updates. All the right side nodes must be greater than current node (min)
        return isValid(root.left,min,root.val) && isValid(root.right, root.val, max);
    }
    
}
