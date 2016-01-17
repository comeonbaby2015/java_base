package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception3
{
	// 方法1：
	// public static void main(String[] args) throws IOException
	public static void main(String[] args)
	{
		//f2();
		
		// 方法2：
		try
		{
			f2();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	// FileNotFoundException继承与 IOException。
	private static void f1() throws FileNotFoundException
	{
		FileInputStream file = new FileInputStream("abc.txt");
		System.out.println("f1 func called!");
	}
	
	private static void f2() throws IOException
	{
		f1();
	}
}