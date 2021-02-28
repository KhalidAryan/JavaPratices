
public class Temp {
	int i;
	int e;
     public Temp(int x, int y) {
    	 this();
    	 i = x;
    	 e =y;
    	 System.out.println("This is the constructoe with arg " + i + " and " +e);
     }
     public Temp (int x) {
    	 i=x;
    	 System.out.println(i);
     }
     
     public Temp() {
    	 System.out.println("This Temp is default constructor");
     }
     public static void main(String[] args) {
		Temp temp= new Temp(6, 7);
		// this(); ..... it represents the 
	}
}
