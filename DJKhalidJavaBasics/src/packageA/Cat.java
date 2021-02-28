package packageA;

import packageB.Mouse;

public class Cat extends Mouse {
       int age = 3;
       String name = "Sammy";
       public static void main(String[] args) { // here show how to access info from another classes.
		
    	   Mouse m = new Mouse();
    	   System.out.println(m.age);
    	   System.out.println(m.name); 
    	   
    	   Cat c =  new Cat();
    	   System.out.println(c.birth);
    		 
    	   Dog d = new Dog();
    	   System.out.println(d.name
    			   );
    	   }
    	   
    	   
	}

