import java.util.*;
class Node1{
    int data;
    Node1 left;
    Node1 right;

    Node1(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class PreOrderTraversal{
    public List<Integer> preOrderTraversal(Node1 root){
        List<Integer> preorder = new ArrayList<>();
        if(root == null){
            return preorder;
        }

        Stack<Node1>  st = new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()){
            root = st.pop();

            preorder.add(root.data);

            if(root.right != null){
                st.push(root.right);
            }

            if(root.left != null){
                st.push(root.left);
            }
        }

        return preorder;
    }
}

class PreOrder{
    public static void main(String[] args){
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.left.right = new Node1(5);

        PreOrderTraversal po = new PreOrderTraversal();
        List<Integer> result = po.preOrderTraversal(root);

        System.out.println("Preorder Traversal : ");
        for(int i : result){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}


