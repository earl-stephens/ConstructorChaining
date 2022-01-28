package application;

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println(person1);

		Person person2 = new Person("Joe");
		System.out.println(person2);
		
		Person person3 = new Person("Sally", 45);
		System.out.println(person3);
		
		Person person4 = new Person(13);
		System.out.println(person4);
	}

}
