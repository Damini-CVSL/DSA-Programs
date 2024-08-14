import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import javafx.util.Pair;

class Node5{
    int data;
    Node5 left;
    Node5 right;

    public Node5(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class TopViewOfBinayTree{
    public List<Integer> topView(Node5 root){
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Map<Integer, Integer> mpp = new TreeMap<>();
        Queue<Pair<Node5, Integer>> q= new LinkedList<>();

        q.add(new Pair<>(root, 0));

        while(!q.isEmpty()){


            Pair<Node5, Integer> pair = q.poll();
            Node5 node = pair.getKey();
            int line = pair.getValue();

            if(!mpp.containsKey(line)){
                mpp.put(line, node.data);
            }

            if(node.left != null){
                q.add(new Pair<>(node.left, line-1));
            }

            if(node.right != null){
                q.add(new Pair<>(node.right, line+1));
            }
        }

        for(int value : mpp.values()){
            ans.add(value);
        }

        return ans;
    }
}

class TopView{
    public static void main(String[] args) {
        Node5 root = new Node5(1);
        root.left = new Node5(2);
        root.left.left = new Node5(4);
        root.left.right = new Node5(10);
        root.left.left.right = new Node5(5);
        root.left.left.right.right = new Node5(6);
        root.right = new Node5(3);
        root.right.right = new Node5(10);
        root.right.left = new Node5(9);

        TopViewOfBinayTree tp = new TopViewOfBinayTree();
        List<Integer> topView = tp.topView(root);

        System.out.println("The Top View of the Binary Tree is :");
        for(int node : topView){
            System.out.print(node + " ");
        }

    }
}