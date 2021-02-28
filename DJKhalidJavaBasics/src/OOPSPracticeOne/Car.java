package OOPSPracticeOne;

public class Car {
	
  private String type;
  
   public Car () {
	   type = "";
	   
   }
  public Car (String type) {
	  this();
  this.type = type;
}
  public String getType() {
	  return type;
  }
  public void setType (String type) {
	  this.type = type;
  }
}