public class Cat extends Pet {
	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void speak() {
		System.out.println(this.name + " said meoww!!\nAge is " + this.age);
	}
}
