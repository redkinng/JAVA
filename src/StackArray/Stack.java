package StackArray;

public class Stack<T> {
    private T[] stack;
    private int numOfItems;

    public Stack(){
        this.stack = (T[]) new Object[1];
    }

    public void push (T data){
        if(numOfItems == this.stack.length){
            resize(2*this.stack.length);
        }

        this.stack[numOfItems++] = data;
    }

    public T pop(){
        if(isEmpty()){
            return null;
        };

        T itemToPop = stack[--numOfItems];
        if(numOfItems > 0 && numOfItems < this.stack.length/4){
            resize(numOfItems/2);
        }

        return itemToPop;
    }

    private void resize (int newSize){
        T[] newStack = (T[]) new Object [newSize];

        for (int i = 0; i< numOfItems; i++){
            newStack[i] = stack[i];
        }

        stack = newStack;
    }

    public boolean isEmpty (){
        return numOfItems == 0;
    }

    public int size(){
        return numOfItems;
    }




}
