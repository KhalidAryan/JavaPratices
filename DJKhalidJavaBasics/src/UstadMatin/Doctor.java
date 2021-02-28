package UstadMatin;

public class Doctor {

	public String Name;
	public String Position;
	public int Id;
	public double Salary;
	public String Section;
	public Doctor() {
	}	
	
	
	public Doctor(String doctorName, String doctorPosition, int doctorId, double doctorSalary, String doctorSection ) {
		
		Name= doctorName;
		Position = doctorPosition;
		Id = doctorId;
		Salary = doctorSalary;
		Section = doctorSection;
}
	public String Surgeon() {
		return "heart and brain operation";
	}
	public String workingShifts() {
		return "  Night shift Monday thru Friday the doctor works in Sentara hospital";
	}
	public int weeklyOperations() {
		return  7;
	}
	public static void main(String[] args) {
		
	 Doctor theDoctor = new Doctor ("Matin", "Surgeon", 555, 16.50, "Emergency ward");
	 System.out.println(theDoctor);
	 
		/*
		 * System.out.println( "Doctor name is:" + d.Name);
		 * System.out.println("Doctor position is:" +d.Position);
		 * System.out.println("Doctor id is:" +d.Id); System.out.println("Doctor gets:"
		 * +d.Salary + " Dollor"); System.out.println("Doctor worksin: " + d.Section);
		 */      
	}

	public String toString() {
		return "Doctor [Name=" + Name + ", Position=" + Position + ", Id=" + Id + ", Salary=" + Salary + ", Section="
				+ Section + ", Surgeon()=" + Surgeon() + ", workingShifts()=" + workingShifts()
				+ ", weeklyOperations()=" + weeklyOperations() + "]";
	
	
	}
	
	
	
	
	
	
	
	
	
	
}