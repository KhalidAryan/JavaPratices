package JavaBasics;

public class MyPractice {

	public static void main(String[] args) {
		
		boolean idPresent= true;
		boolean ageLimit= true;
		boolean balancePaid= true;
	//	if (ageLimit==true && idPresent==true && balancePaid==true );
	//	System.out.println("sell");
		
		//if ( ageLimit==true && idPresent==true && balancePaid==!true);
		//System.out.println("Not enough balance on card");
		
		//if( ageLimit ==true && idPresent==!true);
		//System.out.println("ID needed");
		
		//if(ageLimit == !true);
	//	System.out.println("age limit is not met");
		
		// another way to do this
		if(ageLimit) {
		if (idPresent)	{
			if (balancePaid) {
				System.out.println("sell");
			}else {
				System.out.println("not enough balance on card");
			   }
			} else {
			
				System.out.println("id needed");
		      	}
		
			} else {
				System.out.println("age limit is not met");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
