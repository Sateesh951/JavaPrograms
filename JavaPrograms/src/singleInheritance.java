
class A{
	int a;
	void display() {
		System.out.println(a);
	}
}
class B extends A
{
	int b;
	void add() {
		int c =a+b;
		System.out.println(c);
	}
}
public class singleInheritance {

	public static void main(String[] args) {
		B b = new B();
		b.a=100;
		b.b=200;
		b.add();
		
	}
}
