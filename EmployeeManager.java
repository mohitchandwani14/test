import java.util.*;

class EmployeeException extends Exception{
	public EmployeeException() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeException(String msg) {
		super(msg);
	}
}
public class EmployeeManager{
	final static String menu="~~~~~~~~~~EMPLOYEE MANAGER APP~~~~~~~~~~\n1.TO ADD EMPLOYEE------------>PRESS 1 \n2.TO FIND EMPLOYEE BY NAME---------->PRESS 2\n3.TO REMOVE EMPLOYEE-------->PRESS 3\n4.TO FIND EMPLOYEE BY ID ---->PRESS 4\n5.TO UPDATE EMPLOYEE DETAILS------>PRESS 5\nANY OTHER KEY WILL CLOSE THE APP ";
	static DataRepository component=new ListDataRepository();
	public static void main(String args[])
	{
		boolean processing=true;
		do{
		MyConsole.print(menu);
		int choice=MyConsole.getNumber("Enter Your Choice");
		processing=processMenu(choice);
		}while(processing);
	}
		private static boolean processMenu(int choice) 
		{
		switch(choice)
			{
				case 1:
					addingEmployee();
					return true;
				case 2:
					findByName();
					return true;
				case 3:
					removeEmployee();
					return true;
				case 4:
					findById();
					return true;
				case 5:
					updatingEmployee();
					return true;
				default:
					return false;
				
			}
		
		}
		private static void addingEmployee() 
		{
			//Scanner sc=
			//int id=sc,.nextline
				//try{			//new Employee(id,name,address,salary)
				component.AddEmployee(new Employee(MyConsole.getNumber("Enter the employee id"),MyConsole.getString("Enter the employee name"),MyConsole.getString("Enter the address"),MyConsole.getNumber("Enter the employee salary")));
				//} catch(InputMismatchException ex){
				//	throw new EmployeeException("input is not formatted");
				//}
			
		}
		private static void removeEmployee()
		{
			component.DeleteEmployee(MyConsole.getNumber("Enter the Employee id "));
		}
		private static void findByName()
		{
			
			Employee[] e=component.Find(MyConsole.getString("Enter the name you want to search"));
			for(int i=0;i<e.length;i++)
			if(e[i]!=null)
				MyConsole.print(String.format("id=%d---salary=%d",e[i].empId,e[i].empSalary));
			
		}
		private static void findById()
		{
			Employee e1=component.Find(MyConsole.getNumber("Enter the Employee Id"));
			MyConsole.print(String.format("id=%d---salary=%d",e1.empId,e1.empSalary));
		}
		private static void updatingEmployee(){
			component.UpdateEmployee(new Employee(MyConsole.getNumber("Enter the employee id"),MyConsole.getString("Enter the employee name"),MyConsole.getString("Enter the address"),MyConsole.getNumber("Enter the employee salary")));
			
		}
	
}
class Employee{
	int empId;
	String name;
	String address;
	int empSalary;
	public Employee(int eid,String name,String add,int esal)
	{
		empId=eid;
		this.name=name;
		address=add;
		empSalary=esal;
	}
	//public int getID(){
	//	return empId;
	//}
	}
 interface DataRepository{
	void AddEmployee(Employee emp);// throws EmployeeException;
	void DeleteEmployee(int id);
	//void Displayall();
	Employee[] Find(String name);
	Employee Find(int id);
	void UpdateEmployee(Employee emp);
	}
class ListDataRepository implements DataRepository{
		static List<Employee> e=new ArrayList<Employee> ();
		public void AddEmployee(Employee emp) //throws EmployeeException
		{
			
			e.add(emp);
			MyConsole.print("Employee added Successfully...");
			return;
			
				//throw new EmployeeException("employee details could be added to the System");
			
		}
		public void DeleteEmployee(int id)
		{
				//Employee _e[]=new Employee[e.size()];
			for(int i=0;i<e.size();i++){
				// _e[i]=new Employee();
				// Employee _e=e.get(i);
				if(e.get(i).empId==id){
					e.remove(i);
					MyConsole.print("Employee removed Successfully from database");
					return;
				}
			}
		}
		/*public void Displayall(){
			
			for(int i=0;i<e.size();i++){
				Employee e1=e.get(i);
			System.out.println(e1.empId+" "+e1.empSalary);
			}
		}*/
		public Employee[] Find(String name){
			Employee _e[]=new Employee[e.size()];
			int loc=0;
			for(int i=0;i<e.size();i++)
			{
				//mohit
				if(e.get(i).name.contains(name)){
					_e[loc]=e.get(i);
					loc++;
				}
						//MyConsole.print(String.format("id=%d---salary=%d",_e[i].empId,_e[i].empSalary));
			}
			return _e;
			//int index=e.indexOf(name);
			
		}
		public Employee Find(int id){
			Employee e1=null;
			for(Employee e2:e)
				if(e2.empId==id)
					e1=e2;
			//int index=e.indexOf(id);
			//if(index!=-1)
			//e1=e.get(index);
			return e1;
		}
		public void UpdateEmployee(Employee emp){
			//int i=e.indexOf(emp);
			//e.set(i,emp);
			//Object e1[]=e.toArray();
			for(int i=0;i<e.size();i++)
			{
				if(e.get(i).empId==emp.empId)
				{
					e.set(i,new Employee(emp.empId,emp.name,emp.address,emp.empSalary));
					//e1[i]=new Employee(emp.empId,emp.name,emp.address,emp.empSalary);
					//e=e1.asList(e1[i]);
					return;
				}
			}
			
		}
	}