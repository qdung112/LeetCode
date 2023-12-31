public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>(); 
        if(root == null) return list;
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
            stack.push(curr);
            curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }
