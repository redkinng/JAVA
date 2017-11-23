package StackLinkedList;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(12);
        stack.push(17);
        stack.push(27);

        System.out.println("Size of the stack is " + stack.size());

        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("-----------");

        Stack<Person> stackNew = new Stack<>();

        stackNew.push(new Person(12,"harry"));
        stackNew.push(new Person(17, "rakesh"));
        stackNew.push(new Person(27, "brajesh"));

        System.out.println(stackNew.pop());
        System.out.println(stackNew.pop());
        System.out.println(stackNew.pop());
        System.out.println(stackNew.pop());

    }

}
