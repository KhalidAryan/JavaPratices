package EceptionHandling;

public class Exception {

	public static void main(String[] args) {
		int x = 7;
		int[] y = { 0, 2, 11, 25 };
		String s = null;
		// if(y==0) { // how we deal with exception errors, but instead of If we should
		// use try and catch. its easier
		// System.out.println("I wont study again");
		// }else {
		// System.out.println(x/y);

		try {
			System.out.println(x / y[2]); // if the math is wrong like in y we will use try and catch to go to the
											// second variable to
			System.out.println(s.length());
			// print and print the below msg for us.
		} catch (ArithmeticException e) {
			System.out.println("something is wrong in your math. not sure I should blame your math teacher");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("im sorry cant help you");

		} finally {
			System.out.println("this is finally code");
		}
		divide(2, 4);
	}

	public static void divide(int a, int b) throws {
		
	}
}
