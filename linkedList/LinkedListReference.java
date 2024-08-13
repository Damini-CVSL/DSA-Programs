class Node1{
    int data;
    Node next;

    public Node1(int data1, Node next1){
        this.data = data1;
        this.next  = next1;

    }

    public Node1(int data){
        this.data = data;
        this.next = null;
    }

}

public class LinkedListReference{
    public static void main(String[] args){
        int[] arr = {2,4,5,6,3};

        Node x = new Node(arr[0]);
        // creating a reference 'y' pointing to the same Node 'x'
        Node y=x;
        //Printing the refernce 'y' which represents the memory address of the Node 'x'
        System.out.println(y);
    }
}