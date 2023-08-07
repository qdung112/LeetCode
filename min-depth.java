public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int minDepth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int qSize = queue.size();
            while(qSize > 0){
                qSize--;
                TreeNode node = queue.remove();
                if(node == null) continue;
                if(node.left == null && node.right == null) return minDepth;
                queue.add(node.left);
                queue.add(node.right); 
            }
            minDepth++;
        }
        return -1;
    }
public int minDepth(TreeNode root) {
       if(root == null) return 0;
       if(root.left == null && root.right == null) return 1;
       if(root.left == null) return 1 + minDepth(root.right);
       if(root.right == null) return 1 + minDepth(root.left);
       return Math.min(minDepth(root.left),minDepth(root.right)) + 1; 
    }
