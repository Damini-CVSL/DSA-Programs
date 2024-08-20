class Queue2{
    int size = 0;
    QueueNode front = null;
    QueueNode rear = null;

    class QueueNode{
        int data;
       QueueNode next;

        public QueueNode(int data){
            this.data = data;
            this.next = null;
            
        }


    }

    public void enQueue(int data){
        QueueNode newNode = new QueueNode(data);
        if(newNode == null){
            System.out.println("Queue is full");
        }else{
            if(front == null){
                front = newNode;
                rear = newNode;
            }else{
                rear.next = newNode;
                rear = newNode;
            }
        }
        System.out.println(data+ " is inserted into the queue");
        size++;
    }

    public int deQueue(){
        if(front == null){
            System.out.println("Queue is empty");
        }

        int poppedElement = front.data;
        front = front.next;
        size--;
        return poppedElement;
    }

    public int peek(){
        if(front == null){
            System.out.println("queue is empty");
            return -1;
        }

        return front.data;
    }

    public boolean isEmpty(){
        return front == null;
    }
}

class ImplementingQueueUsingLinkedList{
    public static void main(String[] args){
        Queue2 Q = new Queue2();
        Q.enQueue(10);
        Q.enQueue(20);
        Q.enQueue(30);
        Q.enQueue(40);
        Q.enQueue(50);
        System.out.println("Removing element from queue : "+Q.deQueue());
        System.out.println("The size of the Queue is "+Q.size);
        System.out.println("The Peek element of the Queue is "+Q.peek());
    }
}