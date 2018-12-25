
public class Calculation {
		
	public void sum(int a, int b)
	{
		System.out.println("addtion is " + (a+b));
	
	}
		
	public void sum(int a, int b,int c)
	{
		System.out.println("addtion is " + (a+b+c));
		
	}
	
	public void sum(int a, int b,int c, int d)
	{
		System.out.println("addtion is " + (a+b+c*d));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation a = new Calculation();
		a.sum(10,20);
		a.sum(10,20,30);
		a.sum(10,20,30,5);

	}

}
