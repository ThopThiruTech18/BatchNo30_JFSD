package in02.thiru.fi.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Person {

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		Person person1 = new Person("kiran", 25);
		Person person2 = new Person("charan", 16);
		Person person3 = new Person("vinay", 18);
		Person person4 = new Person("chinna", 12);
		Person person5 = new Person("ranjith", 17);

		List<Person> personsList = Arrays.asList(person1, person2, person3, person4, person5);

		Predicate<Person> pred = person -> person.age >= 18;

		for (Person person : personsList) {

			if (pred.test(person)) {
				System.out.println(person.name);
				System.out.println(person.age);
			}

		}

	}

}
