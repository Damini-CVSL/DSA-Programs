import java.util.ArrayList;
import java.util.List;
class Node3{
    int data;
    Node3 left;
    Node3 right;

    Node3(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


class BoundaryTraversal{

    boolean isLeaf(Node3 root){
        return root.left == null && root.right == null;
    }

    List<Integer> printBoundary(Node3 root){
        List<Integer> result = new ArrayList<>();
    

        if(root == null){
            return result;
        }

        if(!isLeaf(root)){
            result.add(root.data);
        }

        addLeftBoundary(root, result);
        addLeaves(root,result);
        addRightBoundary(root,result);

        return result;
    }

    void addLeftBoundary(Node3 root, List<Integer> result){
        Node3 curr = root.left;
        while(curr != null){

            if(!isLeaf(curr)){
                result.add(curr.data);
            }

            if(curr.left != null){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }
    }

    void addLeaves(Node3 root, List<Integer> result){
        if(isLeaf(root)){
            result.add(root.data);
            return;
        }

        if(root.left != null){
            addLeaves(root.left, result);
        }
        if(root.right != null){
            addLeaves(root.right, result);
        }
    }

    void addRightBoundary(Node3 root, List<Integer> result){
        Node3 curr = root.right;
        List<Integer> temp = new ArrayList<>();
        while(curr != null){

            if(!isLeaf(curr)){
                temp.add(curr.data);
            }

            if(curr.right != null){
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }

        for(int i=temp.size() -1 ; i>=0; i--){
            result.add(temp.get(i));
        }
    }

    public void printResult(List<Integer> res){
        for(int i : res){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}

class Boundary_Traversal{
    public static void main(String[] args){
        Node3 root = new Node3(1);
        root.left = new Node3(2);
        root.right = new Node3(3);
        root.left.left = new Node3(4);
        root.left.right = new Node3(5);
        root.right.left = new Node3(6);
        root.right.right = new Node3(7);

        BoundaryTraversal bt = new BoundaryTraversal();
        List<Integer> res = bt.printBoundary(root);

        System.out.println("Boundary Traversal : ");
        bt.printResult(res);

    }
} 