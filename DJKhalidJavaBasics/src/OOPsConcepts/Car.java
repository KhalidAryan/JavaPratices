package OOPsConcepts;

public class Car {
	 private String type;
	 private String model;
	 private	int year;
	 private String vin;
    public Car() { // we keep constructor public in order to do our work.
	type = "";
	model= "";
	year = 0;	
	setVIN(vin); // 
}

     public String getType() { // in order to access private we use GET and SET. with get we return a result
    	 return type;
     }
     
     public void setType(String newType) {// with set we assign a new value to variable and use VOID 
    	 type= newType;
     }
     public String getModel() {
    	 return model;
     }
     public void setModel(String newModel) {
    	 model =  newModel;
     }
     public int getYear() {
    	 return year;
     }
     public void setYear(int newYear) {
    	 year = newYear;
     }
 	public String getVIN() {
		return vin;
	}
	private void setVIN(String vin) {
		if (vin.length() == 8) {
			this.vin = vin;
			System.out.println("VIN was assigned!");
		} else {
			vin = "";
			System.out.println("VIN was not 8 chars, so it was not assigned!");
			
			
			
			
			
			
}
}}