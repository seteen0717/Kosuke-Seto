package orientation;

public class Dog extends Animal {
	double weight;

	public Dog(String name, int age, double weight) {
		super(name, age);
		this.weight = weight;
	}
	public void dogProfile() {
		System.out.println("名前；" + this.name);
		System.out.println("年齢：" + this.age);
		System.out.println("体重：" + this.weight + "kg");
	}

	public void run() {
		System.out.println(this.name + "は走った");
	}

	public void sleep() {
		System.out.println(this.name + "は眠った");
	}
}
