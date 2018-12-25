import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm = new HashMap();
		//LinkedHashMap hm  = new LinkedHashMap();
		//TreeMap hm = new TreeMap();
		//Hashtable hm = new Hashtable();
		
		hm.put(45, "abc");
		hm.put(58, "efg");
		hm.put(47,"fhfh" );
		hm.put(58, "frfr");
		hm.put(59, "frfr");
	
		Collection entr = hm.entrySet();
		 Iterator<Integer> it  = entr .iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
