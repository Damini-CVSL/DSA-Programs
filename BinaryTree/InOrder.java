import java.util.*;
class Node{
    int data; 
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class InOrderTraversal{
    public List<Integer> inOrderTraversal(Node root){
        List<Integer> inOrder = new ArrayList<>();
        ioTraversal(root, inOrder);
        return inOrder;
    }

    public void ioTraversal(Node root, List<Integer> inOrder){
        if(root == null){
            return;
        }

        ioTraversal(root.left, inOrder);
        inOrder.add(root.data);
        ioTraversal(root.right, inOrder);
    }
}


class InOrder{
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        InOrderTraversal io = new InOrderTraversal();

        List<Integer> result = io.inOrderTraversal(root);
        System.out.println("InOrder Traversal : ");
        for(int i : result){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}







































