import java.util.*;
class TreeNode1{
    int data; 
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
} 

class PostOrderTraversal1{
    public List<Integer> postOrderTraversal(TreeNode1 root){
        List<Integer> postOrder = new ArrayList<>();
        postTraversal(root,postOrder);

        return postOrder;
    }

    public void postTraversal(TreeNode1 root, List<Integer> postOrder){
        if(root == null){
            return;
        }

        postTraversal(root.left, postOrder);
        postTraversal(root.right, postOrder);
        postOrder.add(root.data);
    }
}

class PostOrderWithOneStack{
    public static void main(String[] args){
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);
        root.left.left = new TreeNode1(4);
        root.left.right = new TreeNode1(5);

        PostOrderTraversal1 post = new PostOrderTraversal1();
        List<Integer> result = post.postOrderTraversal(root);
        System.out.println("PostOrder Traversal : ");
        for(int i : result){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}