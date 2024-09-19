
public class OverLoadMainMethod {

	
	void main() {
		System.out.println("Main Methiod");
	}
	
	void main(String name) {
		System.out.println(name);
	}
	void main(String s2, String s3) {
		System.out.println(s2+s3);
	}
	public static void main(String[] args) {
		
		OverLoadMainMethod o = new OverLoadMainMethod();
		o.main();
		o.main("Sathish");
		o.main("Reddy", "Sathish");
		o.main("This is main Method");
		
	}


}
