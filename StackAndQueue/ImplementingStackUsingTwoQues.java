
import java.util.Queue;
import java.util.LinkedList;

class ImplementingStackUsingTwoQues{
    public static void main(String[] args) {
        Stack1 stack = new Stack1();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is : "+stack.top());
        System.out.println("Popped element is : "+stack.pop());
        System.out.println("Top element after pop is : "+stack.top());
        System.out.println("Is stack empty? "+stack.isEmpty());
    }
    
}

class Stack1{
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    


    void push(int x){
        queue2.add(x);
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }

        // swaping names of q1 and q2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop(){
        if(queue1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return queue1.remove();
    }

    public int top(){
        if(queue1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return queue1.peek();
    }

    public boolean isEmpty(){
        return queue1.isEmpty();
    }
}