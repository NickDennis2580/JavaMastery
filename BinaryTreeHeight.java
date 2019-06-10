// Returns the height of a binary tree

public int findHeight(TreeNode root) { 
    
    if(root == null)
        return 0;
    
    int x = findHeight(root.left);
    int y = findHeight(root.right);
    
    return 1 + (x > y ? x : y);

}
