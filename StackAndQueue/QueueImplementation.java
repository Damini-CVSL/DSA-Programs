class QueueImplementation{
    public static void main(String[] args){
        Queue queue = new Queue(6);
        queue.push(4);
        queue.push(14);
        queue.push(24);
        queue.push(34);
        System.out.println("The peek of the queue before deleting any element : "+queue.top());
        System.out.println("The size of the queue before deletion : "+queue.size());
        System.out.println("The first element to be deleted "+queue.pop());
        System.out.println("The peek of the queue after deleting an element : "+queue.top());
        System.out.println("The size of the queue after deleting an element : "+queue.size());
    }
    
}

class Queue{
    private int arr[];
    private int start, end, currSize, maxSize;
    public Queue(){
        arr= new int[16];
        start = -1;
        end = -1; 
        currSize = 0;

    }

    public Queue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        start = -1;
        end = -1; 
        currSize = 0;
    }

    public void push(int newElement){
        if(currSize == maxSize){
            System.out.println("Queue is full");
            System.exit(1);
        }

        if(end == -1){
            end = 0;
            start = 0;
        }else{
            end = (end+1)% maxSize;
        }
        arr[end] = newElement;
        System.out.println("The element pushed is : "+newElement);
        currSize++;
    }

    public int pop(){
        if(start == -1){
            System.out.println("Queue is empty");
            System.exit(1);
        }
        int popped = arr[start];
        if(currSize == 1){
            start = -1;
            end = -1;
        }else{
            start = (start+1) % maxSize;
        }
        currSize--;
        return popped;

    }

    public int top(){
        if(start == -1){
            System.out.println("Queue is empty");
            System.exit(1);
        }
        return arr[start];
    }

    public int size(){
        return currSize;
    }
}

