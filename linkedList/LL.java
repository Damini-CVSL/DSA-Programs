class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

     class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

        
    }

    // add element at begining
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
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
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("b");
        list.printList();
        list.addLast("c");
        list.printList();

        list.deleteFirst();
        list.deleteLast();
        list.printList();

        System.out.println("Size of the list is : "+list.getSize());
    }
}
