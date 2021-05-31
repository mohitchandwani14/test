interface convert{
 void dispTime_InSec();
void dispTime_Inhrs();
}
class Time implements convert{
	float m;
	public void dispTime_InSec(){
	System.out.println( m*60);
	}
	public void dispTime_Inhrs(){
		System.out.println( m/60);
	
	}
	void Accept_minutes(float min){
	this.m=min;
	}
}
public class ex1{
	public static void main(String args[])
	{
		Time c=new Time();
		c.Accept_minutes(20);
		c.dispTime_InSec();
		c.dispTime_Inhrs();
	}
}
