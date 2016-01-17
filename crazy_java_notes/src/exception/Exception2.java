package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception2
{
	public static void main(String[] args)
	{
		//demo1();
		//demo2();
		demo3();
	}
	
	private static void demo1()
	{
		// ArithmeticException为运行时异常，此时未捕获
		print(0);
		System.out.println("\n");
	}
	
	private static void demo2()
	{
		try
		{
			// ArithmeticException为运行时异常，此时捕获
			print(0);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("ArithmeticException called!");
			// 打印生成的异常类的信息
			ex.printStackTrace();
		}
	}
	
	private static void demo3()
	{
		readFile();
	}
	
	// ArithmeticException为运行时异常，可捕获也可以不捕获
	private static void print(int n) throws ArithmeticException
	{
		if(0 == n)
		{
			throw new ArithmeticException("发生算数异常：n 等于0");
		}
	}
	
	// 必须捕获的异常
	private static void readFile()
	{
		//FileInputStream input = new FileInputStream("123.txt");
		try
		{
			FileInputStream input = new FileInputStream("123.txt");
			int b;
        	b = input.read();
        	while (b != -1) 
        	{
            	System.out.print((char) b);
            	b = input.read();
			}				
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("访问异常信息1：In readFile func, FileNotFoundException called! message1:");
			ex.printStackTrace();
			System.out.println("\n");
			
			System.out.println("访问异常信息2：In readFile func, FileNotFoundException called! message2:\n" + ex.getMessage());
			System.out.println("\n");
			
			System.out.println("访问异常信息3：In readFile func, FileNotFoundException called! message3:\n" + ex.toString());
			System.out.println("\n");
			
			 System.out.println("访问异常信息4：In readFile func, FileNotFoundException called! message4:\n");
      		StackTraceElement[] messages=ex.getStackTrace();
      		for(StackTraceElement i : messages)
	       {
		      System.out.println("类名:"+i.getClassName());
		      System.out.println("文件名："+i.getFileName());
		      System.out.println("行号："+i.getLineNumber());
		      System.out.println("方法名："+i.getMethodName());
		      System.out.println("信息："+i.toString());
		      System.out.println("\n");
       		}
      		
      		System.out.println("访问异常信息5：In readFile func, FileNotFoundException called! message2:\n" + ex.getStackTrace());
			System.out.println("\n");
			
			/*PrintStream printStream = new ;
			ex.printStackTrace(printStream);
			System.out.println("访问异常信息5：In readFile func, FileNotFoundException called! message2:\n" + ex.getStackTrace());
			System.out.println("\n");*/
		}
		catch (IOException ex)
		{
			System.out.println("In readFile func, IOException called!");
			ex.printStackTrace();
		}
	}
}