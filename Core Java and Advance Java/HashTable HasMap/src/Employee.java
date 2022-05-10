import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Employee {
	public static void main(String args[]) {
		// ----------hashtable -------------------------
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "Vinay");
		ht.put(101, "Hrishikesh");
		ht.put(102, "Prashant");
		ht.put(103, "Rahul");
		System.out.println("-------------Hash table--------------");
		for (Map.Entry m : ht.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		// ----------------hashmap--------------------------------
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Vaibhav");
		hm.put(104, "Sakshi");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		System.out.println("-----------Hash map-----------");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
