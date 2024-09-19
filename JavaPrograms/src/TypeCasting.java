
class animal {
	String name = "animal";

	void bark() {
		System.out.println("animal is barking");
	}
}

class dog extends animal {
	String name1 = "Dog";

	void speacal() {
		System.out.println("it can shout");
	}
}

public class TypeCasting {

	public static void main(String[] args) {

		/*
		 * // type casting is converting type of data long longvalue = 1000; int
		 * intvalue = (int) longvalue; System.out.println(intvalue);
		 * 
		 * float f = 15.4f; double d = f; System.out.println(d);
		 * 
		 * double d1 = 2.4; float f1 = (float) d1; System.out.println(f1);
		 */

		dog d = new dog();
		String o =d.name;
		System.out.println(o);
		d.bark();
		System.out.println(d.name1);
		d.speacal();

		animal a = new dog();
		System.out.println(a.name);
		a.bark();
		
		/*
		 * animal a2 = new animal(); dog d1 = (dog) a2; d1.speacal();
		 */
		
		animal a1 = new animal();
		System.out.println(a1.name);
		a1.bark();
		
		
		animal a4 = new dog();
		dog d4 = (dog) a4;
		d4.speacal();
		animal a6 = new dog();
		dog d5 = (dog) a6;
		d5.speacal();
		d5.bark();
	
	}
}
