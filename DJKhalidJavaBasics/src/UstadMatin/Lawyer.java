package UstadMatin;

public class Lawyer {

public String Name;
 public int Id;
 public double Salary;
 public String Type;
 public Lawyer() {
	 
 }
 public Lawyer(String lawyerName, int lawyerId, double lawyerSalary, String lawyerType) {
	 Name = lawyerName;
	 Id = lawyerId;
	 Salary = lawyerSalary;
	 Type = lawyerType;
	 

	 Lawyer theLawyer= new Lawyer("Samim", 777, 12.55, "Divorce Lawyer");
	
 } 
 }

