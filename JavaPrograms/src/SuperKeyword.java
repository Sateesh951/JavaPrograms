
class animal3 {
	String voice = "moww";

	void eat() {
		System.out.println("eating ");
	}
}

class dog3 extends animal3 {
	String voice = "Bark";

	void display() {
		System.out.println(super.voice);
	}

	void eat() {
		super.eat();
	}

}

public class SuperKeyword {

	public static void main(String[] args) {

		dog3 d = new dog3();
		d.display();
		d.eat();
	}
}
