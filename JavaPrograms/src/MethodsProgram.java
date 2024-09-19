
class Student {

	int a;
	int b;
	int sum;

	void student() {
		sum = a + b;
		System.out.println(sum);
	}
	Student(int x,int y){
		a=x;
		b=y;
		sum=x+y;
		System.out.println(sum);
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("a is smaller than b");
		}
	}

}

public class MethodsProgram {

	public static void main(String[] args) {

		/*
		 * Student s = new Student(); s.a = 100; s.b = 200; s.student();
		 */
		
		Student s1= new Student(1000, 2000);
		//s1.student();
		

	}
}
