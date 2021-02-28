package OOPsConcepts;

public class Runner {

	public static void main(String[] args) {
	Student st1 = new Student();
	Student st2 = new Student();
	Student st3 = new Student();
	
	st1.fn = "jack";
	st1.age = 15;
	
	st2.fn = "Khalid";
	
	st3.fn = "Zahra";
	//System.out.println(st1.fn);
	
     System.out.println(st1.fn + " age is " + st1.age);
 
     Student st4= new Student("Michael", "Jackson", 150 );
     System.out.println(st4.fn);
     System.out.println(st1.getFirstName());
System.out.println("**********************************************************************************");

    Car v1 = new Car();
   System.out.println(v1.getType());
   
   v1.setType("Velar");
   System.out.println(v1.getType());
   
   
   System.out.println(v1.getType());
   BMW car1 = new BMW();
    Benz car2 = new Benz();
  
   		
	}

}
