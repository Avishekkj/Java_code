import java.lang.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class DemoHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet hs = new HashSet();
		//LinkedHashSet hs = new LinkedHashSet();	
		TreeSet <Integer> hs = new TreeSet<Integer>();
		hs.add(45);
		hs.add(58);
		hs.add(47);
		hs.add(58);
		hs.add(01);
		hs.add(52);
				
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
	}

}
