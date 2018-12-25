import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add(52);
		ll.addFirst(45);
		ll.addLast(52);
		ll.add(2,45);
		System.out.println( "Ll list is "+ ll);
		ll.remove(2);
		ll.removeFirst();
		System.out.println( "Ll list is "+ ll);
	}

}
