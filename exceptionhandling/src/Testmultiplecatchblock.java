
public class Testmultiplecatchblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
		
//			int i = 10;
//			int j= 10;
//			int  result = i/j;
//			System.out.println(result);
			
			int no = Integer.parseInt("s");
			System.out.println(no);
		
		}

		catch(ArithmeticException e1)
		{
			System.out.println(e1);
		}
		
		catch(Exception e2)
		{
			System.out.println("parent exceptions class");
		}
		
			
		
		finally
		{
			System.out.println("in finally");
		}
	}

}
