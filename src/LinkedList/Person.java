package LinkedList;

public class Person implements Comparable<Person> {
    private String name;
    private Integer age;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Person person) {
        return this.age.compareTo(person.age);
    }
}

