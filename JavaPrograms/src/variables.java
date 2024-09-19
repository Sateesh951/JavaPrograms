
public class variables {

	
	int a;
	int b;
	
	void display() {
		int c=30;
		int d = a+b+c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		variables v = new variables();
		v.a=10;
		v.b=20;
		v.display();
	}
}
