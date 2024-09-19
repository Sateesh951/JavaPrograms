import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		
		
		/*
		 * int[] a = new int[10]; a[0]=20; a[1]=30; a[2]=40;
		 */
		
		int[] a = {10,20,30,40,5};
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println(a.length-1);
		
		System.out.println(a[4]);
		
		for(int i : a) {
			System.out.print(i+",");
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		Object aa[] = {10,10.5,"Sathish",'D',true};
		
		for(Object o:aa) {
			System.out.println(o);
		}
		for(int i=0;i<aa.length;i++) {
			System.out.println(a[i]);
		}
   }
}
