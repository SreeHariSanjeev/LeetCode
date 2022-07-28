class Solution {
    public boolean isValidBST(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack<>();
        return isValid(root, stack );
        
        
    }
    
    //Inorder traversal, Check the each element with previous element
    //Previous element can be tracked with stack
    
    boolean isValid(TreeNode root, Stack<TreeNode> st)
    {
        if(root!= null)
        {
                Boolean isBst = true;
            
                isBst = isValid(root.left,st);
            
                //Need to check current node if left Subtree is BST
                if(!st.isEmpty() && isBst)
                {
                    TreeNode previous = st.pop();
                    
                    if(previous.val >= root.val)
                    {
                        
                        isBst = false;
                    }
                }
                
                st.push(root);
                
                //Need to check right subtree only if all the previous elements are BST
                if(isBst)
                {
                    isBst = isValid(root.right,st);
                }
                return isBst;
                
        }
        
        return true;
       
    }
    
}
