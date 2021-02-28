package UstadMatin;

public class Employee {

	public int id;
	public double salary;
	public String name;
	public String position;
	// behavior of object are shown in methods.
	// constructor is a block of code use to initialize the newly create objects.
	public Employee(int employeeId, String employeeName, double employeeSalary, String employeePosition) { // this is a constructor.
		id = employeeId;
		name= employeeName;
		position =employeePosition;
		salary= employeeSalary;
				
	}
	
	public double getSalary() {
		return salary;
	}
	public String answerToCall() {
		return "the telephone operators answers the call";
	}
	public String callToCustomer() {
		return "Help the cutomers";
	}
	public String help() {
		return "Know what they need help with";
	}
	
	public static void main(String[] args) {
		// object
		// name of class + a name + = + new constructor. as below we create the object and above we created the map for it
		//(int employeeId, String employeeName, double employeeSalary, String employeePosition)
		
		Employee theEmployee= new Employee(10, "khalid", 10.50, "tester" );
		System.out.println(theEmployee);
		
		// calling or invoking
	//	System.out.println( "employeeID: " + theEmployee.id);
	//	System.out.println( "employeeSalary: " + theEmployee.salary);
	//	System.out.println( "employeePosition: " + theEmployee.position);
	//	System.out.println( "employeeName: " + theEmployee.name);
	//	System.out.println( "This employee Gets: " + theEmployee.getSalary() + " Dollor");
		//System.out.println( theEmployee.answerToCall());
	//	System.out.println(  theEmployee.callToCustomer());
	//	System.out.println(  theEmployee.help());
		System.out.println("*****************************************************************************");
		// below e have a second way of craeting 2nd object.
		
		Employee theEmployee1= new Employee(15, "Ahadi", 20.50, "Designer" );
System.out.println(theEmployee1);

	//	System.out.println( "employeeID: " + theEmployee1.id);
	//	System.out.println( "employeeSalary: " + theEmployee1.salary);
	//	System.out.println( "employeePosition: " + theEmployee1.position);
	//	System.out.println( "employeeName: " + theEmployee1.name);
	//	System.out.println( "This employee Gets: " + theEmployee1.getSalary() + " Dollor");
	//	System.out.println( theEmployee1.answerToCall());
	//	System.out.println(  theEmployee1.callToCustomer());
		//System.out.println(  theEmployee1.help());
			
		
		// overRide toString is a method to sysout too many sysouts in one sysout.
		
		}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", position=" + position
				+ ", getSalary()=" + getSalary() + ", answerToCall()=" + answerToCall() + ", callToCustomer()="
				+ callToCustomer() + ", help()=" + help() + "]";
		
	}
		
	
	}


