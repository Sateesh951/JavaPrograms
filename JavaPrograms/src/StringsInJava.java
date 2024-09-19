import java.util.Arrays;

public class StringsInJava {

	public static void main(String[] args) {

		String s = "Sathish";
		String s1 = "reddy";
		String s2 = "Maramreddy";
		String s3 = "  HI    ";

		// finding length of the String
		int length = s.length();
		System.out.println(length);

		// using concat method to add String words
		String concat = s.concat(s1);
		System.out.println(concat);
		

		String concat3Strings = s.concat(s1).concat(s2);
		System.out.println(concat3Strings);
		System.out.println("sathish " + "reddy");

		// removing spaces right and left using trim() method
		System.out.println("Before trimming the String :: " + s3.length());
		String trim = s3.trim();
		System.out.println(trim);
		System.out.println("After trimmming the String :: " + trim.length());

		// returns a character from a String based on the index -- using charAt() method
		String c = "Sathish";
		int l = c.length();
		System.out.println(c.charAt(5)); // index 5 from the String
		for (int i = 0; i < l; i++) {
			System.out.print(c.charAt(i));
		}

		// contains() method will return true or false
		// boolean contains = s.contains("Sat");
		System.out.println(s.contains("ish"));
		System.out.println(s.contains("loke"));
		System.out.println(s.contains("ish"));

		// using equals and equalsIgnorecase for comparing two Strings or words
		String w = "sathish";
		String w1 = "Sathish";

		System.out.println(w == w1);
		System.out.println(w.equals(w1));
		System.out.println(w.equalsIgnoreCase(w1));

		// replace method
		String v = "Reddy";
		String v1 = v.replace("Reddy", "Maram");
		System.out.println(v1);

		// SubString -- getting some portion of String from given String
		String x = "Sathish";
		String x1 = x.substring(6, 7);
		System.out.println(x1);
		String a = "123";
		int a1 = Integer.parseInt(a);
		String a2 = a.toString();
		System.out.println(a1);
		System.out.println(a2);

		// split method -- split the String into multiple parts
		String b = "Sathish Reddy";
		String d = "sathish123maramreddy@gmail.com";

		String[] b1 = b.split(" ");
		System.out.println(Arrays.toString(b1));
		System.out.println(b1[0]);
		System.out.println(b1[1]);

		String d1[] = d.split("123");
		System.out.println(d1[0]);
		System.out.println(d1[1]);

		// Example
		String e = "21,$4,35,#75";

		String e2 = e.replace("$", "").replace("#", "");
		System.out.println(e2);
		String e3 = e.replace("#", "");
		System.out.println(e3);

		// Example 2
		String f = "abc,123@gmail.com";
		String[] f1 = f.split(",");
		System.out.println(Arrays.toString(f1));

		String[] f2 = f1[1].split("@");
		System.out.println(Arrays.toString(f2));
		System.out.println(f2[0]);
		System.out.println(f2[1]);

		System.out.println(f1[0]);
		System.out.println(f2[0]);
		System.out.println(f2[1]);

		String[] f4 = f2[1].split("[.]");
		System.out.println(Arrays.toString(f4));

		// you can split if the String is having "." by using [.] this we can split the
		// String
		String z = "gmail.com";
		String[] f3 = z.split("[.]");
		System.out.println(Arrays.toString(f3));
		System.out.println(f3[0]);
		System.out.println(f3[1]);

		// Reverse String
		String n = "Sathish";
		String rev = "";

		for (int i = n.length() - 1; i >= 0; i--) {
			rev = rev + n.charAt(i);

		}
		System.out.println(rev);
		
	}
}
