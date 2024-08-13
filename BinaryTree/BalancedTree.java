class TreeNode3{
    int data;
    TreeNode3 left;
    TreeNode3 right;

    TreeNode3(int data){
        this.data = data;
        this.left = null;
        this.right = null;

    }
}
 
class BalancedTreeOrNot{

    boolean isBalanced(TreeNode3 root){
        return heightOfATree1(root) != -1;
    }


    public int heightOfATree1(TreeNode3 root){
        if(root == null)
            return 0;

        int left = heightOfATree1(root.left);
        if(left == -1)  
            return -1;

        int right = heightOfATree1(root.right);
        if(right == -1)
            return -1;
        if(Math.abs(left-right)>1)
            return -1;
        return 1+ Math.max(left, right);
    }
}

class BalancedTree{
    public static void main(String[] args) {
        TreeNode3 root = new TreeNode3(1);
        root.left = new TreeNode3(2);
        root.right = new TreeNode3(3);
        root.left.left = new TreeNode3(4);
        root.left.right = new TreeNode3(5);

        BalancedTreeOrNot bt = new BalancedTreeOrNot();
        if (bt.isBalanced(root)) {
            System.out.println("The tree is balanced.");
        } else {
            System.out.println("The tree is not balanced.");
        }
    }
}