import java.util.LinkedList;
import java.util.Queue;
class ImplementingStackUsingSingleQueue{
    public static void main(String[] args) {
        Stack2 stack = new Stack2();
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(1);
 
        System.out.println("Top of the stack: " + stack.top());
        System.out.println("Size of the stack before removing element: " + stack.size());
        System.out.println("The deleted element is: " + stack.pop());
        System.out.println("Top of the stack after removing element: " + stack.top());
        System.out.println("Size of the stack after removing element: " + stack.size());
    }
}

class Stack2{
    Queue<Integer> q = new LinkedList<>();
    
    void push(int x){
        q.add(x);
        for(int i=0; i<q.size()-1; i++){
            q.add(q.remove());
        }
    }

    int pop(){
        if(q.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return q.remove();
    }

    int top(){
        if(q.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return q.peek();
    }

    int size(){
        return q.size();
    }
}