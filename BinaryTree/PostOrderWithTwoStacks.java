import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class PostOrderTraversal{
    public List<Integer> postOrderTraversal(TreeNode root){
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        List<Integer> postOrder = new ArrayList<>();

        if(root == null){
            return postOrder;
        }

        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.push(root);
            if(root.left != null){
                st1.add(root.left);
            }
            if(root.right != null){
                st1.add(root.right);
            }
        }

        while(!st2.isEmpty()){
            postOrder.add(st2.pop().data);
        }
        return postOrder;
    }
 
}

class PostOrderWithTwoStacks{
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        PostOrderTraversal post = new PostOrderTraversal();

        List<Integer> result = post.postOrderTraversal(root);
        System.out.println("PostOrder Traversal : ");
        for(int i : result){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}