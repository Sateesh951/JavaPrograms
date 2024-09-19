
public class twoDimentionalArray {

	public static void main(String[] args) {
		
		
		/*
		 * int[][] a = new int[3][4];
		 * 
		 * a[0][0]=10; a[0][1]=20; a[0][2]=100; a[1][0]=30; a[1][1]=40; a[1][2]=200;
		 * a[2][0]=300; a[2][1]=400; a[2][2]=500;
		 */
		
		int a[][]= { {10,20,30,40},{50,60,70,80}};
		
		System.out.println("No of rows :: " +a.length);
		System.out.println("find the length of columns:: "+ a[0].length);
		System.out.println(a[0][3]);
		
		/*
		 * for(int r=0;r<=a.length-1;r++) {
		 * 
		 * for(int c=0;c<=a[r].length-1;c++) { System.out.print(a[r][c]+" "); }
		 * System.out.println(); }
		 */
		
		for(int[] r : a) {
			for(int c : r) {
				System.out.print(c+" ");
			}
		}
		
		
	}
}
