package OOPSPracticeOne;

public class BMW extends Car{
  private String bmwVersion;
 public BMW () {
	 super();
	 bmwVersion = "";
	 
 }
 public BMW (String type, String bmwVersion) {
	 super(type);
	 this.bmwVersion = bmwVersion;
 }
 public String getBMWvVersion() {
	 return bmwVersion;
 }
}
