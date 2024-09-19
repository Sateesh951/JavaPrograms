
public class SumOfArrays {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of array :: " + sum);

		for (int i : a) {
			sum1 = sum1 + i;

		}
		System.out.println(sum1);

	}
}