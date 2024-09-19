
public class constructor {
	
	int x,y;
	
	constructor()
	{
		 x = 100;
		 y = 200;
	}

	constructor(int a,int b){
		
		x=a;
		y=b;
		
	}
	void sum () {
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		
		constructor c1 = new constructor();
		System.out.println(c1);
		
		constructor c = new constructor(10,30);
		c.sum();
 }
}