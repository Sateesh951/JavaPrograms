
public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "sathishreddy maram reddy";

		String rev = "";

		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);

		}

		System.out.println("Reverse String is ::: " + rev);
		
		//Approach 2    -- by converting String to char array type
		String rev1 = "";
		char[] s = str.toCharArray();
		for(int i=s.length-1;i>=0;i--) {
			rev1 = rev1+s[i];
		}
		System.out.print("Reverse String is ::: "+rev1);
		System.out.println();
		
		
		//Approach 3 -- using StringBuffer class
		StringBuffer s2 = new StringBuffer("Reddy");
		System.out.println("Reverse String is ::: "+s2.reverse());
		
		//Approach 4 --using StringBuilder
		StringBuilder s3 = new StringBuilder("Maramreddy");
		System.out.println("Reverse String is ::: "+s3);
	
		String s1="java";//creating string by Java string literal    
		char ch[]={'s','t','r','i','n','g','s'};    
		String ss=new String(ch);//converting char array to string    
		String ss1=new String("java");//creating Java string by new keyword    
		System.out.println(s1);    
		System.out.println(ss);    
		System.out.println(ss1);  
		
		System.out.println(s1==ss1);
		
	}

}

