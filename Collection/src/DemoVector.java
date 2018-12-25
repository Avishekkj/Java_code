import java.util.*;
public class DemoVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		
		v.add(10);
		v.add(15);
		v.add(10);
		v.add(20);
		v.add(-14);
		v.add("d");			
				
		Iterator it = v.iterator();
		while((it).hasNext())
			
	{
		System.out.println(it.next());
		
	}
	}

}
