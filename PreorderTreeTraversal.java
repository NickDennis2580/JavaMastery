// Iterate through a tree in preorder iteratively.

public ArrayList<Integer> preorderItr(TreeNode root) {
    
    ArrayList<Integer> preorderedList = new ArrayList<Integer>();
    Stack<TreeNode> stak = new Stack<TreeNode>();
    
    if(root == null)
        return preorderedList;
    
    stak.push(root);
    TreeNode temp = new TreeNode();        
    while(!stak.empty()){
        temp = stak.pop();
        preorderedList.add(temp.data);
        if(temp.right != null)
            stak.push(temp.right);
        if(temp.left != null)
            stak.push(temp.left);
    }
    return preorderedList;
}
