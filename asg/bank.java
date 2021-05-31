class bankexception extends Exception
{
	bankexception(){
	}
	bankexception(String msg){
	super(msg);
	}

}
public class bank{
	void withdraw(int a)
	{  
		if(a>1000)
		{
			System.out.println("withdraw ="+a);
		}
	
	
	
	}
	public static void main(String args[])
	{
		try{
		bank a=new bank();
		int b=900;
		if(b>1000)
		a.withdraw(b);
		}
		catch(bankexception b)
		{
		System.err.println("amount must be greater than 1000");
		}
		catch(Exception e){
		System.err.println("amount must be greater than 1000");
		}
	
	}
}