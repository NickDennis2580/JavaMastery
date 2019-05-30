// Counts the number of nodes in a tree

public int size(TreeNode root) {
    if(root == null)
        return 0;
    
    return size(root.left) + size(root.right) + 1;
}
