 public TreeNode searchBST(TreeNode root, int val) {
        TreeNode result = null;
        if(root != null)
        {
            if(root.val == val)
            {
                result = root;
            }
            else if(root.val< val)
            {
                result = searchBST(root.right,val);
            }
            else
            {
                result = searchBST(root.left,val);
            }

        }
       return result;

    }
