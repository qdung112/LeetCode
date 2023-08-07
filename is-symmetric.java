 public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        TreeNode left = root.left;
        TreeNode right = root.right;
        if(left == null && right == null) return true;
        if(left == null || right == null || left.val != right.val) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(left);
        queue.offer(right);
        while(!queue.isEmpty()){
            left = queue.poll();
            right = queue.poll();
            if(left == null && right == null) continue;
            if(left == null || right == null || left.val != right.val) return false;
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }
        return true;
    }

 public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        TreeNode left = root.left;
        TreeNode right = root.right;
        return isSame(left,right);
    }
    public static boolean isSame(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null || left.val != right.val) return false;
        return isSame(left.left,right.right) && isSame(left.right,right.left);
    }
