// Sums up all the nodes of a tree

public int sum(TreeNode root) { 
    
    if(root == null)
        return 0;
    
    return sum(root.left) + sum(root.right) + root.data;
}
