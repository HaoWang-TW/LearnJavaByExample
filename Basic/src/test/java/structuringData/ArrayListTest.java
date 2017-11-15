package structuringData;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    @Test
    public void initArrayList() {
        ArrayList<Person> persons = new ArrayList<>();
        Assert.assertEquals(0, persons.size());
        Assert.assertTrue(persons.isEmpty());
    }

    @Test
    public void addElement() {
        ArrayList<Person> persons = new ArrayList<>();
        // add single element
        persons.add(new Person("hao"));
        persons.add(new Person("wang"));
        Assert.assertEquals(2, persons.size());
        ArrayList<Person> persons2 = new ArrayList<>();
        persons2.add(new Person("hua"));
        persons2.add(new Person("tu"));
        // add collection
        persons.addAll(persons2);
        Assert.assertEquals(4, persons.size());
    }

    @Test
    public void removeElement() {
        ArrayList<Person> persons = new ArrayList<>();
        Person hua = new Person("hua");
        persons.add(hua);
        persons.add(hua);
        // remove element by reference
        persons.remove(hua);
        Assert.assertEquals(1, persons.size());
        // remove element by index
        persons.remove(0);
        Assert.assertEquals(0, persons.size());
        persons.add(hua);
        boolean removed = persons.remove(new Person("hua"));
        // hua and new Person("hua") are not same
        Assert.assertFalse(removed);
        Assert.assertEquals(1, persons.size());
    }

    @Test
    public void useRemoveIf() {
        ArrayList<Person> persons = new ArrayList<>();
        Person hua = new Person("hua");
        persons.add(hua);
        persons.add(new Person("hua"));
        persons.removeIf(person -> person.getName() == "hua");
        Assert.assertEquals(0, persons.size());
    }

    @Test
    public void useRemoveAll() {
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<Person> personsToRemove = new ArrayList<>();
        Person hua = new Person("hua");
        Person hao = new Person("hao");
        persons.add(hua);
         personsToRemove.add(hua);
        personsToRemove.add(hao);
        // remove elements contained in specified list, return true if list changed
        boolean removed = persons.removeAll(personsToRemove);
        Assert.assertTrue(removed);
        Assert.assertEquals(0, persons.size());
    }
    @Test
    public void containsElement() {
        ArrayList<Person> persons = new ArrayList<>();
        Person hua = new Person("hua");
        persons.add(hua);
        Assert.assertFalse(persons.contains(new Person("hua")));
        Assert.assertTrue(persons.contains(hua));
    }
    @Test
    public void iterator() {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("hao"));
        persons.add(new Person("hua"));
        // use forEach to iterate arrayList
        persons.forEach(person -> System.out.print(person.getName()));
        // use for
        for (Person person : persons) {
            System.out.print(person.getName());
        }
        // use fori to iterate
        for (int i = 0; i < persons.size(); i++) {
            System.out.print(persons.get(i).getName());
        }
    }
   // @Test
/**
 * There are other methods:
 *  indexOf(E element)
 *  lastIndexOf(E element)
 *  removeRange(int start, int end)
 *  retainAll(Collection c)  //Retains only the elements in this list that are contained in the specified collection.
 *  trimSize()
 *  toArray()
 *  toArray(T)
 *  replaceAll(UnaryOperactor<E> operator>)
 *  clear()
 */

}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
