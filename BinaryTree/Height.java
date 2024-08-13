class TreeNode2{
    int data;
    TreeNode2 left;
    TreeNode2 right;

    TreeNode2(int data){
        this.data = data;
        this.left = null;
        this.right = null;

    }
}

class HeightOfATree{
    public int heightOfATree(TreeNode2 root){
        if(root == null)
            return 0;

        int left = heightOfATree(root.left);
        int right = heightOfATree(root.right);

        return 1+ Math.max(left, right);
    }
}

class Height{
    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(1);
        root.left = new TreeNode2(2);
        root.right = new TreeNode2(3);
        root.left.left = new TreeNode2(4);
        root.left.right = new TreeNode2(5);
        root.left.right.right = new TreeNode2(6);
        root.left.right.right.right = new TreeNode2(7);

        HeightOfATree ht = new HeightOfATree();
        System.out.println("Height of a tree is :"+ht.heightOfATree(root));

    }
}