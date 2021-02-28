package AbstractionNInterface;

public abstract class Person {
	
	private String name;
	
	
	 public abstract void printInfo();
		 
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getName() {
		 return this.name;
	 }
	 }


