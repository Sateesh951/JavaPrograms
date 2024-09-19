
interface computer {
	void code();
}

class laptop implements computer {
	public void code() {
		System.out.println("coding::compile::run");
	}
}

class desktop implements computer{
	public void code() {
		System.out.println("coding::compile::run::faster");
	}
}

class developer{
	public void devApplication(desktop desk) {
		desk.code();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {

		desktop d1 = new desktop();
		
		laptop lap = new laptop();
		developer d = new developer();
		d.devApplication(d1);
	}
}
