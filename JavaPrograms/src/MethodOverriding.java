
class sathish {
	void Bank(int accno,String name) {
		System.out.println(accno);
		System.out.println(name);
	}
}

class sathish1 extends sathish {
	void Bank(int accno,String name) {
		
		System.out.println(accno + " belongs to sathish");
		System.out.println(name + " belongs to sathish");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		sathish1 s = new sathish1();
		s.Bank(123144568, "Sathish reddy");
	}
}
