package application;

public class Person {
	private String name;
	private int age;
	private static final String NO_NAME = "[not supplied]";
	
	/* Lots of repetition here.  Instead, can have one
	 * constructor call another constructor.  Usually
	 * call the constructor that takes the most
	 * parameters, using keyword this.
	 * this must be the first line in the constructor
	 */
	public Person() {
		/* replace this 
		name = "[not supplied]";
		age = 0;
		* with
		*/
		this(NO_NAME, 0);
	}

	public Person(String name) {
		/* replace this
		this.name = name;
		this.age = 0;
		* with
		*/
		this(name, 0);
	}
	
	public Person(int age) {
		/* replace this
		this.name = "[not supplied]";
		this.age = age;
		* with
		*/
		this(NO_NAME, age);
	}
	
	//basically all of the above constructors call this one
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ", " + age;
 	}
}
