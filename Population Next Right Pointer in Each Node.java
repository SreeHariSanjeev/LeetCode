class Solution {
    public Node connect(Node root) 
    {
        if(root != null)
        {
             connect(root.left , root.right);
        }

        return root;
    }
    void connect(Node leftTree , Node rightTree)
    {
        if(leftTree != null && rightTree != null)
        {
            leftTree.next = rightTree;
            connect(leftTree.left,leftTree.right);
            connect(leftTree.right, rightTree.left);
            connect(rightTree.left,rightTree.right);
        }
    }


}
