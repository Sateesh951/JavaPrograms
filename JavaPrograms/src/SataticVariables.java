
public class SataticVariables {

	static int a = 100;
	int b = 200;
	
	void add() {
		int d = a+b;
		System.out.println(d);
	}
	public static void main(String[] args) {
		System.out.println(SataticVariables.a);
		SataticVariables s = new SataticVariables();
		s.b=300;
		s.b=400;
		s.add();
	}
}
