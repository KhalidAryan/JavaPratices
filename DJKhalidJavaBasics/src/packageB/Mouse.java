package packageB;

public class Mouse {
    public  int age = 2; // these are called instance variable
    public  String name = "Tiny"; //these are called instance variable
    private String gender = "male";
    protected String birth= "11/21";
    void bark() {
    	gender = "female";
    }
    public static void main(String[] args) {
		Mouse m = new Mouse();
		m.gender = "male";
	}
}
