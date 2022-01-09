void calculate(TreeNode root, List<List<Integer>> result, List<Integer> path, int target, int sum)
    {
        if(root != null)
        {
            sum = sum + root.val;

            path.add(root.val);
            if(target == sum && root.left == null && root.right == null)
            {
                 //New array should be created before adding because 'path' can be modified even after adding to the result
                List<Integer> ls = new ArrayList<Integer>(path); // Shallow copy
                result.add(ls);
            }
            calculate(root.left,result,path,target, sum);
            calculate(root.right,result,path,target,sum);
            path.remove(path.size()-1);

        }

    }
