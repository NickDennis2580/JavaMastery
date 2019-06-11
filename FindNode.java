// Find node in a binary tree

public TreeNode findNode(TreeNode root, int val) {
    if(root == null)
        return null;
    
    Stack<TreeNode> stak = new Stack<TreeNode>();
    
    stak.push(root);
    TreeNode temp = new TreeNode();
    while(!stak.empty()){
        temp = stak.pop();
        if(temp.data == val)
            return temp;
        if(temp.right != null)
            stak.push(temp.right);
        if(temp.left != null)
            stak.push(temp.left);
    }
    
    return null;
}
