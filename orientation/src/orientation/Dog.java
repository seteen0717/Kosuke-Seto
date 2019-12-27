package orientation;

public class Dog extends Animal {
	double weight;

	public Dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		System.out.println("名前；" + this.name);
		System.out.println("年齢：" + this.age + "歳");
		System.out.println("体重：" + this.weight + "kg");
	}

	public void run() {
		System.out.println(this.name + "は走った");
	}

	public void sleep() {
		System.out.println(this.name + "は眠った");
	}
}
