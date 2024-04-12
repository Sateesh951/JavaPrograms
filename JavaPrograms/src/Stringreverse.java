
public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "sathishreddy";
		
		String src="";
		
		/*
		 * for(int i=0; i<name.length();i++) {
		 * 
		 * src = name.charAt(i)+src;
		 * 
		 * }
		 */
		
		for(int i=str.length()-1;i>=0;i--) {
			
			src= src+str.charAt(i);
		
		}
		System.out.println(src);
	}

}
