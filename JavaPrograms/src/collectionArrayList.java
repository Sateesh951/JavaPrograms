import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class collectionArrayList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("sathish");
		al.add("lokesh");
		al.add("ravi");
		al.add("vinay");
		al.add("apple");

		System.out.println("before sorting ::: " + al);

		Collections.sort(al);

		for (Object a : al) {
			System.out.println("After sorting ::: " + a);
		}
		System.out.println("Before reversing arrayList is ::: " + al);

		Collections.sort(al, Collections.reverseOrder());
		for (Object o : al) {
			System.out.println("After reverse arrayList is ::: " + o);
		}

		ArrayList<Object> a = new ArrayList<Object>();
		a.add(100);
		a.add("String");
		a.add(10.5);
		a.add(100);
		a.add(null);
		a.add(null);
		System.out.println(a);
		
		System.out.println("Before removing Element :::");
		a.remove(10.5);
		
		System.out.println("Retriving Element from ArrayList :::" +a.get(2));
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		for(Object o : a) {
			System.out.println(o);
		}
		
		Iterator il = a.iterator();
		System.out.println(il.next());
		
		while(il.hasNext()) {
			System.out.println(il.next());
		}
		
		
	}
}
