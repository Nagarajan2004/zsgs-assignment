package methodoverloading;

class Person{
	private String name;
	private int age;
	private String address;
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "name=" + name + 
				", age=" + (age == 0 ? "age is Not set" : age) + 
				", address=" + (address == null ? "No address" : address) + "\n";
	}
	
}

public class PersonDemo {
	public static void main(String[] args) {
		Person person1 = new Person("krishnamoorthy");
		Person person2 = new Person("haribala", 21);
		Person person3 = new Person("Gowtham", 21, "120-1, 2nd street, tenkasi");
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
	}
}
