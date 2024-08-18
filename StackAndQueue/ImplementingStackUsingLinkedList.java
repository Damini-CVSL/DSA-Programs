class Stack3{

    int size;
    StackNode top;

    Stack3(){
        this.top = null;
        this.size = 0;
    }
    class StackNode{
        int data ;
        StackNode next;
        public StackNode(int data){
            this.data = data;
            this.next = null;
        }
    }


    public void push(int x){
        StackNode element = new StackNode(x);

        element.next = top;
        top = element;
        System.out.println("Element pushed");
        size++; 
    }
    

    public int pop(){
        if(top == null)
            return -1;
        
        int topData = top.data;
        top = top.next;
        return topData;
    }

    public int stackSize(){
        return size;
    }

    public boolean stackIsEmpty(){
        return top == null;
    }

    public void printList(){
        StackNode currNode = top;
        while(currNode != null){
            System.out.print(currNode.data);
            currNode = currNode.next;
        }
        System.out.println();
    }
}

class ImplementingStackUsingLinkedList{
    public static void main(String[] args){
        Stack3 st = new Stack3();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Element popped " + st.pop());
        System.out.println("Stack size: " + st.stackSize());
        System.out.println("Stack is empty or not: " + st.stackIsEmpty());

    }
}