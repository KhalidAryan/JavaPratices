package JavaBasics;

public class ConditionalOperatorExamples {

	public static void main(String[] args) {
		int a =10;
		
		boolean x = a>5 ? true : false;
				System.out.println(x);
				
				int age = 20;
				System.out.println(age>=21 ? "you can drive" : "you can not drive yet");
				
				{String result= age >=21 ? "get in" : "can not let you in";
				String test = "this is a String";
				System.out.println(result);
				System.out.println(test);}
				
				// condition ? true : false. this is the structure. example. boolean z = true ? true : false;
				// can we use AND, OR with this. yes
				
				
				boolean notsure = age>=21 ? true : age>20 ? true : false;
			
				System.out.println(notsure);
				
				
				
				
				
				
				
				String boys = age >= 35? "drink alcohol" : "don't drink alcohol";
				System.out.println(boys);
				
				
	}

}
