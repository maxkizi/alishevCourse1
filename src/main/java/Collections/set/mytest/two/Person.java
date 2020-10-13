package Collections.set.mytest.two;

import java.util.Comparator;

public class Person implements Comparable {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        if(this.id > person.id) return -1;
        else if (this.id < person.id) return 1;
        else return 0;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person)obj;
        return this.name.equals(p.name) && this.id==p.id;
    }
}
