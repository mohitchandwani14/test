
class Student
{
	int rollno;
	String name;
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	Student(String name)
	{
		this.name=name;
	}
	int getroll(){
		return rollno;
	}
	String getname(){
		return name;
	}
	
}
class Studentdata{
	 static Student s[]=new Student[1];
	public static void main(String args[])
	{
		getdata();
		printdata();
		
	}
	private static void getdata()
	{
		int id[]=new int[s.length];
		String name[]=new String[s.length];
		for(int i=0;i<s.length;i++)
		{
			 id[i]=MyConsole.getNumber("enter the student id");
			 name[i]=MyConsole.getString("enter the name of student ");
			s[i]=new Student(id[i],name[i]);
			
		}
	}
	private static void printdata(){
		for(int i=0;i<s.length;i++)
		{
			
			MyConsole.print("details of "+ i +"th position");
			
			MyConsole.print(s[i].getroll());
			MyConsole.print(s[i].getname());
		}
	}
	
}
