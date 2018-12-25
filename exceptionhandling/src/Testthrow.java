//import java.awt.FontFormatException;

public class Testthrow {

	public void validate(int age)throws Exception
	{
		if  (age<18)
			throw new ArithmeticException("not allowed to vote");
			
			else 
				System.out.println("wel to come");
	}
	
	
	public static void main(String[] args){
		try{
			
		Testthrow obj = new Testthrow();
	    obj.validate(14);
		}
		
		catch(Exception e){
		System.out.println(e);
	}
			
	}
}
