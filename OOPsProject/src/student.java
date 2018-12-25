public class student {

	private  int roll ;
	private String name;
	private float  marks;
	private static  String collage = "TIS";
	
	public student() {
	roll= 90;
	name= "akash";
	marks = (float) 98.4;
	}
		
   public student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

   public student(int roll, String name, float marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
       
	public void print()
{
    System.out.print("roll is  "+ roll);
	System.out.print(" ,name  is  "+ name);
	System.out.println(" and marks is "+ marks);
	System.out.println(" and collage is "+ collage);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1= new student();
		s1.print();
		
		student s2= new student(12,"ras",89);
		s2.print();
		
		student s3= new student(0, "Ram");
		s3.print();

	}

}
