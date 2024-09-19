
class animal1 {

	void eat(int a) {
		System.out.println("eating non-veg");
		System.out.println(a);
	}
}

class dog1 extends animal1 {

	void eat(int a) {
		System.out.println(a*a*a);
		System.out.println("eating bread");
	}
}

class cat extends animal1 {
	void eat(int a) {
		System.out.println(a*a);
		System.out.println("drinking milk");
	}
}

public class MethodOverRidingConcept {

	public static void main(String[] args) {

		dog1 b = new dog1();
		b.eat(200);
		cat c = new cat();
		c.eat(100);
		

	}
}
