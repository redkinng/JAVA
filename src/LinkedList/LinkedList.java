package LinkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {
    private Node<T> root;
    private int sizeOfList;

    @Override
    public void insert(T data) {
        this.sizeOfList++;

        if(root==null){
            Node<T> newNode = new Node<>(data);
            this.root = newNode;
        } else {
            //insertNodeAtBegining(data);
            insertAtTheEnd(data);
        }

    }

    private void insertNodeAtBegining(T data){
        Node<T> newNode = new Node<T>(data);
        newNode.setNextNode(this.root);
        this.root = newNode;
    }

    private void insertAtTheEnd(T data){
        if(this.root.getNextNode() == null){
            this.root.setNextNode(new Node<>(data));
        } else {
            insertAtTheEndHelper(data, root.getNextNode());
        }
    }

    private void insertAtTheEndHelper(T data, Node<T> newNode ){
        if(newNode.getNextNode() == null){
            newNode.setNextNode(new Node<>(data));
        } else {
            insertAtTheEndHelper(data, newNode.getNextNode());
        }
    }

    @Override
    public void remove(T data) {
        this.sizeOfList--;

        if(this.root == null) return;

        if(this.root.getData().compareTo(data) == 0){
            this.root = this.root.getNextNode();
            //this.root = null;
        } else {
            removeNodeHelper(data, root, root.getNextNode());
        }

    }

    private void removeNodeHelper(T data, Node<T> node, Node<T> nextNode){
        if(nextNode.getData().compareTo(data) == 0 ){
            node.setNextNode(nextNode.getNextNode());
            nextNode = null;
        }else{
            removeNodeHelper(data, nextNode, nextNode.getNextNode());
        }
    }

    @Override
    public void traverseList() {
        Node<T> root = this.root;

        if(root == null){
            System.out.println("No Items in the Linked List. Please add some!!");
            return;
        }

        while(root != null) {
            System.out.println(root.getData() + "--> ");
            root = root.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.sizeOfList;
    }
}
