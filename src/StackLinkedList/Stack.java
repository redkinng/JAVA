package StackLinkedList;

public class Stack <T extends Comparable<T>> {
    private Node<T> root;
    private int count;

    //O(1)
    public void push(T data){
        this.count++;

        if(root == null) {
            this.root = new Node<>(data);
        }else{
            Node<T> newNode = new Node<>(data);
            newNode.setNextNode(this.root);
            this.root = newNode;
        }
    }

    public T pop(){
        if(root == null){
            System.out.println("nothing to pop");
            return null;
        }else{
            T itemToPop = this.root.getData();
            this.root = this.root.getNextNode();
            this.count--;
            return itemToPop;
        }
    }

    public boolean isEmpty(){
        return root==null;
    }

    public int size(){
        return this.count;
    }

}
