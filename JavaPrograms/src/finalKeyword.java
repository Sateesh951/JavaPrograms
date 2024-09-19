
class addition {
	final int x = 100;
	static int y = 200;

	void add() {
		int c = x + y;
		System.out.println(c);
	}
}

class substraction extends addition {
	// final int x=500; here we can change the final value from child class but not
	// through object creation
	static int y = 500;

	void add() {
		int c = x + y;
		System.out.println(c);
	}
}

public class finalKeyword {

	public static void main(String[] args) {
		addition a = new addition();
		substraction s = new substraction();
		// s.x=200;
		s.y = 600;
		s.add();

	}
}
