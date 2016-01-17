package exception;

public class Finally
{
	int demo()
	{
		//private static int x = 1;

		int x = 1;
		
		try
		{
			
			
			System.out.println("In demo, x(1) = " + x);
			return ++x;
		}
		catch(Exception ex)
		{
			System.out.println("In demo, x(2) = " + x);
		}
		finally
		{
			System.out.println("In demo, x(3) = " + x);
			++x;
			System.out.println("In demo, x(4) = " + x);
			//return x;
		}
		System.out.println("In demo, x(5) = " + x);
		return x;
	}
	
	public static void main(String[] args)
	{
		Finally f = new Finally();
		int result = f.demo();
		System.out.println("In main, result = " + result);
	}
	
}