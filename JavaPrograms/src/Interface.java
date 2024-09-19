
interface caluclation{
	
	int a = 100;
	int b = 200;
    void multiple();
	default void add() {
		System.out.println("This is Deafult abstract method");
	}
	static void sub() {
		System.out.println("This is static abstract method");
	}
}
public class Interface implements caluclation{
	
	@Override
	public void multiple() {
		// TODO Auto-generated method stub
		int c = a*b;
		System.out.println(c);
	}
	
	void divide() {
		int d = a/b;
		System.out.println(d);
	}


	public static void main(String[] args) {
		
		Interface i = new Interface();
		i.add();
		i.multiple();
		i.divide();
		System.out.println(i.a);
		System.out.println(i.b);
		caluclation.sub();      //static methods directly access from class without object creation
		
		caluclation c = new Interface();
		c.add();
		c.multiple();
		
	}
}

	
