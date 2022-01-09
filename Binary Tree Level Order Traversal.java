class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Integer> ls = new ArrayList<>();
        Queue<TreeNode> newQ = new LinkedList<>();
        while(!q.isEmpty())
        {


            TreeNode node = q.remove();
            if(node != null)
            {
                ls.add(node.val);
                newQ.add(node.left);
                newQ.add(node.right);

            }


            if(q.isEmpty())
            {
                q = newQ;
                if(!ls.isEmpty())
                    list.add(ls);

                newQ = new LinkedList<>();
                ls = new ArrayList<>();
            }
        }
        return list;

    }
}
