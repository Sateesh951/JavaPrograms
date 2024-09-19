
public class FindingMinimumValueInArray {

	static void findingminandmax(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Maximum number in an array is ::; "+max);
		System.out.println("Minimun number in an array is ::; "+min);

	}

	public static void main(String[] args) {

		int a[] = { 10, 52, 86, 74, 62 };
		findingminandmax(a);

	}
}
