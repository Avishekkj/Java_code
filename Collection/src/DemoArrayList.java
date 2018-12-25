 import java.util.*;
public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(-14);
		ar.add("d");
		
		Iterator it = ar.iterator();
			while((it).hasNext())
				
		{
			System.out.println(it.next());
			
		}

	}

}
