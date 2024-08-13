class TreeNode4{
    int data;
    TreeNode4 left;
    TreeNode4 right;

    TreeNode4(int data){
        this.data = data;
        this.left = null;
        this.right = null;

    }
}
 
class DiameterOfATree{
    int diameter = 0;

    public int heightOfATree1(TreeNode4 root){
        if(root == null)
            return 0;

        int left = heightOfATree1(root.left);
        
        int right = heightOfATree1(root.right);
        diameter = Math.max(diameter, left+right);

        return 1+ Math.max(left, right);
    }

    int diameterofATree(TreeNode4 root){
        heightOfATree1(root);
        return diameter;
    }
}

class Diameter{
    public static void main(String[] args) {
        TreeNode4 root = new TreeNode4(1);
        root.left = new TreeNode4(2);
        root.right = new TreeNode4(3);
        root.right.left = new TreeNode4(4);
        root.right.left.left = new TreeNode4(5);
        root.right.left.left.left = new TreeNode4(9);
        root.right.right = new TreeNode4(6);
        root.right.right.right = new TreeNode4(7);
        root.right.right.right.right = new TreeNode4(8);


        DiameterOfATree d = new DiameterOfATree();
        System.out.println("Diameter of a tree is : "+d.diameterofATree(root));
        
        
    }
}