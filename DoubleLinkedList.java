class DoubleLinkedList{
    Node head;
    int size;
    public DoubleLinkedList(){
        this.size = 0;
    }

    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        
        newNode.prev = currNode;
        currNode.next = newNode;
        
    }

    public void addMiddle(int data, int index){
        if(index == 0){
            addFirst(data);
            return;
        }else if (index == size){
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        for(int i=1; i<index; i++){
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        newNode.prev = currNode;
        currNode.next.prev = newNode;
        currNode.next = newNode;
        }

    void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
        head.prev = null;
    }

    void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        size--;
        secondLast.next = null;
    }

    void deleteMiddle(int index){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }
        
        if(index == 0){
            deleteFirst();
            return;
        }
        else if(index == size){
            deleteLast();
            return;
        }

        size--;
        Node previousNode = head;
        for(int i=1; i<index; i++){
            previousNode = previousNode.next;
        }

        Node currNode = previousNode.next;
        previousNode.next = currNode.next;
        currNode.next.prev = previousNode;
    }


    public void printList(){
        if(head == null){
            System.out.println("List is not present");
            return;
        }

        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+ " ->");
            currentNode = currentNode.next;

        }
        System.out.print("NULL");
    }

    public  int getSize(){
        return size;
    }

    public static void main(String[] args){
        DoubleLinkedList list = new DoubleLinkedList();
        list.addFirst(10);
        list.printList();
        System.err.println();
        list.addLast(20);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(80);
        list.printList();
        System.out.println();
        System.out.println("Size of data "+list.getSize());
        System.out.println();
        list.addMiddle(30, 2);
        list.printList();
        System.out.println();
        System.out.println("Size of data "+list.getSize());
        System.out.println();
        list.deleteFirst();
        list.printList();
        System.out.println();
        System.out.println("Size of data "+list.getSize());
        list.deleteLast();
        list.printList();
        System.out.println();
        System.out.println("Size of data "+list.getSize());
        System.out.println();
        list.addMiddle(10, 0);
        list.printList();
        System.out.println();
        System.out.println("Size of data "+list.getSize());
        list.addMiddle(80, 7);
        list.printList();
        System.out.println();
        System.out.println("Size of data "+list.getSize());
        list.deleteMiddle(3);
        list.printList();
        System.out.println();
        System.out.println("Size of data "+list.getSize());
        list.deleteMiddle(0);
        list.printList();
        System.out.println();
        System.out.println("Size of data "+list.getSize());
        list.deleteMiddle(6);
        list.printList();
        System.out.println();
        System.out.println("Size of data "+list.getSize());
    }

}