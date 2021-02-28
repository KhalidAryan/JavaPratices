  package UstadMatin;
  
	public class Driver {
		
		public String  position;
		public double Salary;
		public int Id;
		public String Location;
		public String Name;
		
		public Driver() {
			
		}
		 public Driver(String driverPosition, double driverSalary, int driverId, String driverLocation, String driverName) {
			position = driverPosition;
			Salary= driverSalary;
			Id= driverId;
		    Location= driverLocation;
			Name= driverName;
		 }
		
		

		public String driverSkills() {
			 return "Can driver 24/7 non stop";
		 }
		public double gettingSalary() {
			return Salary;
		}
		public String drivingRangeArea() {
			return " Drives all over united States";
		}
		public static void main(String[] args) {
			Driver d = new Driver("Driver manager", 11.05, 1234, "Hilton hotel", "John");
			System.out.println(d);
			
			
			
				
			/*
			 * System.out.println("Driver position is: " + d.position);
			 * System.out.println("Driver makes: " + d.Salary);
			 * System.out.println("Driver is holdind Id: " + d.Id);
			 * System.out.println("Driver is working in: " +d.Location);
			 * System.out.println("Driver name is: " + d.Name);
			 * System.out.println("This driver " + d.driverSkills());
			 * System.out.println("This driver makes " + d.gettingSalary()+ " Dollor");
			 * System.out.println("This driver  " + d.drivingRangeArea());
			 */

		

		}
		
		public String toString() {
			return "Driver [position=" + position + ", Salary=" + Salary + ", Id=" + Id + ", Location=" + Location
					+ ", Name=" + Name + ", driverSkills()=" + driverSkills() + ", gettingSalary()=" + gettingSalary()
					+ ", drivingRangeArea()=" + drivingRangeArea() + "]";
		}
		}
		
		
			
		


	

