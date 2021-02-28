  package PolyMorphism;

public class polyMorphismBasics {
	
	//public void PrintMyMessage(String message)
	public void PrintMyMessage(Object message){ // by adding object we chose a parent for both student and polyMorphismBasic objects.
		System.out.println(message);
	}
	

	public static void main(String[] args) {
		polyMorphismBasics obj = new polyMorphismBasics();
	 
		Student S = new Student("Khalid");
		
		obj.PrintMyMessage("testing");
		System.out.println(S); // so we can use one sysout to print both or chose whichever we print.
	}

}
