
public class Emp {
	
	int id;
	String name;
	Address address;
		
	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
}
 
	public void display(){
		System.out.print(id +" " + name );
		System.out.println(address.city  + address.state + address.country);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add1 = new Address("kol "," WB "," IND ");
		Emp e1 =new Emp(10,"avis",add1);
		e1.display();
		
	}
}
