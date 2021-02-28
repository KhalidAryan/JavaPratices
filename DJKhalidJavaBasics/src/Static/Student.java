package Static;

public class Student {

	  private String lastName;
	  private String firstName;
	  
	  static int count= 0;
	  public Student(String lastName, String firstName) {
		  super();
	  }
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
