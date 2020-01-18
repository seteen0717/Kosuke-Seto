package orientation;

public class Person {

	private String name = "";
	private int age = 0;

	public Person() {};
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	static int wallet = 0;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です");
		System.out.println("年齢は" + this.age + "です");
		System.out.println("よろしくお願いします");
	}
	Person(int wallet) {
		this.wallet += wallet;

	}



}
