
public class Employee {
	private int id;
	private String name;
	private float sal;

     	public Employee()
     	{
	     	id =1;
		    name= "Avi";
		    sal = 100;
		  //System.out.println("Hi");
	     }

	    public Employee(int id, String name, float sal) {
			
			this.id = id;
			this.name = name;
			this.sal = sal;
		}

		public void print()
	{
	    System.out.print("id is  "+ id);
		System.out.print(" ,name  is  "+ name);
		System.out.println(" and sal is "+ sal);
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee a = new Employee();
	a.print();
		
		Employee b = new Employee(2,"Syne",90);
	b.print();	 
				
	}

}
