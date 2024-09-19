import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetProgram {

	public static void main(String[] args) {
		
	
	HashSet<Object> a = new HashSet<Object>();
	a.add(10);
	a.add(10.5);
	a.add("String");
	a.add(true);
	a.add(10);
	a.add(null);
	a.add(null);
	
	System.out.println(a);
	
	a.remove(true);
	
	//Accessing specific element is not possible 
	//but if you want access any element from hash set you need to convert hashSet to arrayList
	
	//converting hashSet to ArrayList
	ArrayList al = new ArrayList(a);
	System.out.println("After convert to ArrayList ::: "+al);
	System.out.println("here we are retriving element using Index ::; "+al.get(2));
	for(Object aa:a) {
		System.out.println(aa);
	}
	
	Iterator il = a.iterator();
	
	System.out.println();
	
	while(il.hasNext()) {
		System.out.println(il.next());
	}
	
	for(int i=0;i<a.size();i++) {
		System.out.println(a);
	}
	
	System.out.println(a.size());
	a.clear();
	System.out.println(a.isEmpty());
	
	System.out.println(a);
	
	}
}
