import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		Map hmap = new HashMap();
		
		hm.put(1, "Sathish");
		hm.put(2, "Lokesh");
		hm.put(3, "Ravi");
		hm.put(1, "NTR");
		
		System.out.println(hm);
		
	    System.out.println(hm.size());
	    
	    hm.remove(3);
	    System.out.println(hm);
	    
	    //hm.replace(2, );
	    System.out.println(hm.get(2));
	    
	    System.out.println(hm.keySet());
	    System.out.println(hm.values());
	    System.out.println(hm.entrySet());
	    
	    
	}
}
