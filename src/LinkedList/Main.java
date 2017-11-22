package LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Person> list = new LinkedList<Person>();

        Person p = new Person("purnank", 45);

        list.insert(new Person("rakesh", 78));
        list.insert(p);
        list.insert(new Person("Hardeep", 25));

        list.remove(p);

        System.out.println("Size of list is "+list.size());

        list.traverseList();
    }
}
