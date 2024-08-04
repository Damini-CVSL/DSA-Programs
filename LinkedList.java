class Node{
    int data;  //the data value
    Node next; //the reference to the next node

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class LinkedList{
    public static void main(String[] args){
        int arr[] = {2,4,6,8};

        Node y = new Node(arr[0]);

        System.out.println(y.next);
    }
}