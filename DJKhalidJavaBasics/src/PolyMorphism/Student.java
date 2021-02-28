package PolyMorphism;

public class Student extends Person {
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
   public Student() {
	   this.name = "";
   }
   public String toString() {
	   return name;
   }
}
