class LinkedList1 {
    Node head;
    private int size;

    LinkedList1(){
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

    public void addMiddle(int data, int index){


        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        if(index == 0){
            addFirst(data);
            return;
        }

        if(index == size){
            addLast(data);
            return;
        }

         Node currentNode = head;
         for(int i=1; i<index; i++ ){
            currentNode = currentNode.next;
         }

         newNode.next = currentNode.next;
         currentNode.next = newNode;
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

    public void deleteMiddle(int index){
        if(head == null){
            System.out.println("List is empty");
            return;

        }
        size--;
        
        if(index == 0){
            deleteFirst();
            return;
        }else if(index == size){
            deleteLast();
            return;
        }

        
        Node previousNode = head;

        for(int i=1; i<index; i++){
            previousNode = previousNode.next;
        }
        Node currentNode = previousNode.next;
        previousNode.next = currentNode.next;

    }

    public int getSize(){
        return size;
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
        LinkedList1 list = new LinkedList1();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(6);
        list.printList();
        list.addMiddle(8, 3);
        list.printList();
        list.deleteMiddle(3);
        list.printList();
        System.out.println("Size of the list is : "+list.getSize());
    }
}
