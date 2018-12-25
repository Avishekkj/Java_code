import com.synechron.employee.Employee;
import com.synechron.employee.Tester;
import com.synechron.employee.programmer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e= new Employee(10,"avii",125);
		e.display();
		
		programmer p = new programmer(10,"avii",125,85);
		p.display();

		Tester t = new Tester(10,"avii",125,85);
		t.display();
						
	}

}
