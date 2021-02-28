package Static;

public class Runner {

	public static void main(String[] args) {
		Student s = new Student();
		Student y = new Student();
		s.count = 10;
		System.out.println(s.count);
		System.out.println(y.count);
		
		s.count = 5;
		System.out.println(s.count);
		System.out.println(y.count);
		
		



	}

}
