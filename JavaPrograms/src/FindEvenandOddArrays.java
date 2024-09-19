
public class FindEvenandOddArrays {

	public static void main(String[] args) {

		int a[] = { 10, 24, 31, 47, 56 };
		System.out.println("Even Numbers of array is :: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {

				System.out.println(a[i]);
			}
		}
		System.out.println("odd numbers of array is ::");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
	}
}
