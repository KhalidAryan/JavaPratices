package JavaBasics;

public class PalindromeExamples {

	public static void main(String[] args) {
		
		
		String t = "dad";
		String tReversed = "";
		
		
		for(int i = 0; i < t.length(); i++){ // how to reversen it. for (int i = t.length() -1; i>=0;i--){}
			
		for (int i= t.length() - 1; i >=0; i--) {
			tReversed += t.charAt(i);
		}
	
if (t.equals(tReversed)) {
	System.out.println("palindrome");
	System.out.println(t +" is equal to " + tReversed);
}else {
	System.out.println("not palindrom");
	System.out.println(t +" is NOT equal to " + tReversed);

}
		}}}
		
	
		
	

	


