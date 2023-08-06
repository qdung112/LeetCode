 if(p == null && q == null) return true;
       if(p == null || q == null) return false;
       Queue<TreeNode> queue = new LinkedList<>();
       queue.offer(p);
       queue.offer(q);

       while(!queue.isEmpty()){
           TreeNode one = queue.poll();
           TreeNode two = queue.poll();
           if(one == null && two == null) continue;
           if(one == null || two == null || one.val != two.val) return false;
           queue.offer(one.left);
           queue.offer(two.left); 
           queue.offer(one.right);
           queue.offer(two.right);   
       }
       return true;  
