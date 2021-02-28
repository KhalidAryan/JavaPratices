package UstadMatin;

public class Engineer {
	
	public String  position;
	public double Salary;
	public int Id;
	public String department;
	public String Name;
	
	public Engineer() {
		
	}
	 public Engineer(String engineerPosition, double engineerSalary, int engineerId, String engineerDepartment, String engineerName) {
		position = engineerPosition;
		Salary= engineerSalary;
		Id= engineerId;
	    department= engineerDepartment;
		Name= engineerName;
	 }
	
	

	public String engineerRanking() {
		 return "senior Engineer";
	 }
	public double gettingSalary() {
		return Salary;
	}
	public String responsibilities() {
		return " Designs tall buildings";
	}
	public static void main(String[] args) {
		Engineer theEngineer = new Engineer("Big Boss", 15.05, 6564, "Quality assurance", "Khalid");
		System.out.println(theEngineer);
		
		
		}
			
		// System.out.println("Engineer position is: " + theEngineer.position);
		// System.out.println("Engineer makes: " + theEngineer.Salary);
		// System.out.println("Engineer is holdind Id: " + theEngineer.Id);
		// System.out.println("Engineer is working in: " +theEngineer.department);
		// System.out.println("Engineer name is: " + theEngineer.Name);
		// System.out.println("This engineer is: " + theEngineer. engineerRanking());
		 //System.out.println("This engineer makes: " + theEngineer.gettingSalary()+ " Dollor");
		// System.out.println("This engineer is responsible for: " + theEngineer.responsibilities());
		 

	public String toString() {
		return "Engineer [position=" + position + ", Salary=" + Salary + ", Id=" + Id + ", department=" + department
				+ ", Name=" + Name + ", engineerRanking()=" + engineerRanking() + ", gettingSalary()=" + gettingSalary()
				+ ", responsibilities()=" + responsibilities() + "]";

	
	}}
	
	
		
	


