package Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<Integer>();

        myQueue.enqueue(15);
        myQueue.enqueue(17);
        myQueue.enqueue(27);

        System.out.println(myQueue.size());

        System.out.println(myQueue.dequeue());
        System.out.println("size "+myQueue.size());
        System.out.println(myQueue.dequeue());
        System.out.println("size "+myQueue.size());
        System.out.println(myQueue.dequeue());
        System.out.println("size "+myQueue.size());
        System.out.println(myQueue.dequeue());
        System.out.println("size "+myQueue.size());

    }
}
