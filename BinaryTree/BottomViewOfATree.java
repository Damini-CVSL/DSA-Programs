import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import javafx.util.Pair;

class Node6{
    int data;
    Node6 left;
    Node6 right;

    public Node6(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BottomViewOfATree{
    public List<Integer> bottonView(Node6 root){
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Map<Integer, Integer> mpp = new TreeMap<>();
        Queue<Pair<Node6, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root, 0));

        while(!q.isEmpty()){
            Pair<Node6, Integer> pair = q.poll();
            Node6 node = pair.getKey();
            int line = pair.getValue();


            mpp.put(line, node.data);

            if(node.left != null){
                q.add(new Pair<>(node.left, line-1));
            }
            if(node.right != null){
                q.add(new Pair<>(node.right, line+1));
            }
        }

        for(Map.Entry<Integer, Integer> entry: mpp.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;
    }
}

class BottomView{
    public static void main(String[] args) {
        Node6 root = new Node6(1);
        root.left = new Node6(2);
        root.left.left = new Node6(4);
        root.left.right = new Node6(10);
        root.left.left.right = new Node6(5);
        root.left.left.right.right = new Node6(6);
        root.right = new Node6(3);
        root.right.right = new Node6(10);
        root.right.left = new Node6(9);

        BottomViewOfATree bt = new BottomViewOfATree();
        List<Integer> res = bt.bottonView(root);

        System.err.println("Bottom View of a tree is  : ");
        for(int node : res){
            System.out.print(node+ " ");
        }
    }
}