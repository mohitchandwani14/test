//numberformat
//dividebyzero
//classnotfound
//inputmismatch
import java.io.*;
import java.util.*;
class ex2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try{
		
			//ex2 e1=new ex2();
			int a=10/0;
			//int b=sc.nextInt();
			//String a="";
			//FileReader fr=new FileReader("any.txt");
			//System.out.println(a);
			
		}
		//catch(ArithmaticException ex)
		//{
		//	System.err.println(ex.getMessage());
		//}
		catch(Exception e)
		{
		System.err.println(e.getMessage());
		}
		
	}
}