import java.util.LinkedList;

class CollectionLinkedList{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();

        list.add("a");
        list.addFirst("b");
        list.addLast("c");
        System.out.print(list);
        System.out.println();
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.print(list);
        list.remove(1);
        System.out.print(list);



    }
}