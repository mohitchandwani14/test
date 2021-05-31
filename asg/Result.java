class Student{
	void result(int a,int b){
		if(a>10&&b>10)
			
		System.out.println("student called");
		
	}
}
class marks extends Student{
void result(int a,int b){
	if(a>25&&b>25)
		
		System.out.println("marks called");
		
	}
}
public class Result extends marks{
 void result(int a,int b){
	 if(a>35&&b>35)
		
		System.out.println("result called");
		
	}
	public static void main(String args[]){
		Student r=new Student();
		r.result(15,15);
		r=new marks();
		r.result(30,30);
		r=new Result();
		r.result(40,40);
	}
}