class ReversedLinkedList {
    Node head;
    private int size;

    ReversedLinkedList(){
        this.size = 0;
    }

     class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add element at begining
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

   public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
         head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head. next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public void reverseList(){
        if((head == null) ||(head.next == null)){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!= null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // updating previousNode and currentNode

            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }



    // print linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReversedLinkedList list = new ReversedLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();
        list.reverseList();
        list.printList();
    }
}
