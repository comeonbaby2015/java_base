package exception;

public class Exception1
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(2/0);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("ArithmeticException called!");
			// 打印生成的异常类的信息
			ex.printStackTrace();
		}
		catch(Exception ex)
		{
			System.out.println("Exception called!");
			ex.printStackTrace();
		}
			
	}
}