
public class StringsAssignment {

	public static void main(String[] args) {

		// removing spaces from given String

		String s = "Sat hi   sh  reddy maram reddy";

		String s1 = s.replace(" ", "");
		String ss = s.replaceAll("\\s", "");
		System.out.println(s1);
		System.out.println(ss);

		// finding whether String is Palindrome or not

		String s2 = "sts";

		String rev = "";

		for (int i = s2.length() - 1; i >= 0; i--) {
			rev = rev + s2.charAt(i);
		}
		System.out.println(rev);

		if (rev.equals(s2)) {
			System.out.println("String is Palindrome");
		} else
			System.out.println("Not Palindrome");

		// remove junk or special characters in string

		String s3 = "sathish@gmail#$.com%";
		String s4 = s3.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s4);

		// count occurrence of character in a String
		String s5 = "String is Palindromeeessgg";
		char c = 'r';
		int count = 0;
		for (int i = 0; i <= s5.length() - 1; i++) {

			if (s5.charAt(i) == c) {
				count++;
			}
		}
		System.out.println(count);

		// find number of Words in a String
		String s6 = "sathish reddy maram reddy";
		int count1 = 1;
		for (int i = 0; i < s6.length() - 1; i++) {

			if ((s6.charAt(i) == ' ') && (s6.charAt(i + 1) != ' ')) {
				count1++;
			}
		}
		System.out.println(count1);

	}
}
