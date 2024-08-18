import java.util.Stack;
class ImplementingQueueUsingTwoStacks{
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.push(4);
        q.push(3);
        q.push(2);
        q.push(1);
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());
    }
}

class Queue1{
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void push(int x){
        input.add(x);   
    }

    public int pop(){
         if(output.isEmpty()){
            while(input.empty() == false){
                output.add(input.pop());
                
            }
         }
         int x = output.peek();
         output.pop();
         return x;
    }

    public int peek(){
        if(output.isEmpty()){
            while(input.empty() == false){
                output.add(input.peek());
                input.pop();
            }
        }
        return output.peek();
    }

    int size(){
        return (output.size() + input.size());
    }
}