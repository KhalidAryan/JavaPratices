
public class StackAndHeap {

	public static void main(String[] args) {
		
		String x1 = "test";
		String x2 = "test";
		
		System.out.println(x1==x2); // ture
		System.out.println(x1.equals(x2)); // true
		
		
		String y1 = new String("test"); // when calling the constructor and calling an object it will create a new memory space. so they won't be ==.
		//but if we say EQUAL sign it checks it letter by letter like both test are the same thats why second sysout is true. 
		String y2 = new String("test");
		
		System.out.println(y1==y2); // false 
		System.out.println(y1.equals(y2)); // true

		

	}

}
