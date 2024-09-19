
public class thisKeyword {

	int x,y;
	
	void thisKeyword(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	void display() {
		
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		thisKeyword t = new thisKeyword();
		t.thisKeyword(10, 20);
		t.display();
	}
}
