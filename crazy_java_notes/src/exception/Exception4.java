package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception4
{
	// 方法1：
	// public static void main(String[] args) throws IOException
	public static void main(String[] args)
	{
		//f2();
		
		// 方法2：
		try
		{
			f1();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
//		catch(FileNotFoundException ex)
//		{
//			ex.printStackTrace();
//		}
			
	}
	
	// FileNotFoundException继承与 IOException。
	private static void f1() throws FileNotFoundException
	{
		FileInputStream file = new FileInputStream("abc.txt");
		System.out.println("f1 func called!");
	}
	
	
}