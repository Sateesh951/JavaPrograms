
public class MethodOverloading {
	
	void sum() {
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
	}
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	void sum(int x, double y) {
		System.out.println(x+y);
	}
	void sum(double a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.sum();
		m.sum(100, 200);
		m.sum(1000.12, 2000);
		m.sum(3000, 4000.14);
	}
}
