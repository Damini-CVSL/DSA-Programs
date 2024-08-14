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

public class TwoTreesAreIdenticalOrNot{

    public boolean isIdentical(Node1 root1, Node1 root2){
        if(root1 == null && root2 == null){
            return true;
        }

        if(root1 == null || root2 == null){
            return false;
        }

        return ((root1.data == root2.data) && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right));
    }
}

class IdenticalTrees{
    public static void main(String[] args){
        Node1 root1 = new Node1(1);
        root1.left = new Node1(2);
        root1.right = new Node1(3);

        Node1 root2 = new Node1(1);
        root2.left = new Node1(2);
        root2.right = new Node1(3);
        root2.left.left = new Node1(4);

        TwoTreesAreIdenticalOrNot id = new TwoTreesAreIdenticalOrNot();

        if(id.isIdentical(root1, root2)){
            System.out.println("The binary trees are identical");
        }else{
            System.out.println("The binary trees are not identical");
        }
    }
}