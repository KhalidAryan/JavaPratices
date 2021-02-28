package AbstractionNInterface;

public class Teacher extends Person {

	@Override
	public void printInfo() {
		System.out.println("Teacher:" + super.getName());
		
	}

}
