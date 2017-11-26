package Queue;

public class Queue <T extends Comparable<T>> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int count;

    public boolean isEmpty(){
        return this.firstNode == null;
    }

    public int size(){
        return this.count;
    }

    public void enqueue(T data){
        count++;

        Node<T> oldLastNode = this.lastNode;
        Node<T> newNode = new Node<T>(data);
        this.lastNode = newNode;
        newNode.setNextNode(null);

        if(isEmpty()){
            this.firstNode = this.lastNode;
        }else{
            oldLastNode.setNextNode(this.lastNode);
        }
    }

    public T dequeue (){
        if(isEmpty()){
            return null;
        } else{
            count--;
            T dataToReturn = this.firstNode.getData();
            this.firstNode = this.firstNode.getNextNode();
            if(isEmpty()){
                this.lastNode = this.firstNode;
            }
            return dataToReturn;
        }
    }

}
