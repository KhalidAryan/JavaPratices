package JavaBasics;

public class NestedLogics {

	public static void main(String[] args) {
		
		
		int age = 35;
		double price= 110;
		boolean primeMember= false;
				
				// if its a prime member, we give 5% discount
		// if age is more than 20, we give 3% discount
				// if age is more than 30, we give 2% discount
		       // if age is more than 40, we give 1% discount
		       // for non prime members, we have 2% discount
		       //if age is more than 60, we add  1%% discount
		
		if (primeMember == true && age > 40) {
			System.out.println(price * 0.06);
			
		} else if (primeMember == true && age > 30) {
			System.out.println(price * 0.07);
			
		} else if (primeMember ==true && age >20) {
			System.out.println(price * 0.08);
		} else if(primeMember == false && age > 60) {
		System.out.println(price * 0.03);
		
		} else if (primeMember == false && age <= 60) {
			System.out.println(price * 0.02);
			
			//there are two ways to code this, one ABOVE and other BELOW
			
			if(primeMember) {
				// this is for prime members
				if( age >40) {
					//6%
				} else if (age>30) {
					//7%
				}else if (age>20) {
					//8%
				}else {
					//5%
				} else {
					// this is for non prime member
					if (age >60) {
						//3%
					}else { 
						//2%
					}
					int age = 60;
					double price = 489.85;
					boolean primeMember = true;
					// if its a prime member, we give 5% discount
					// if age is more than 20, we give another 3% discount
					// if age is more than 30, we give another 2% discount
					// if age is more than 40, we give another 1% discount
					// for non prime members, we have 2% discount
					// if age is more 60, we add another 1% discount
					if (primeMember) {
						// this is for prime members
						if (age > 40) {
							// 6%
							System.out.println(
									"You are saving 6% or $" + (price * 0.06) + ". Your total is $" + (price - (price * 0.06)));
						} else if (age > 30) {
							// 7%
						} else if (age > 20) {
							// 8%
						} else {
							// 5%
						}
					} else {
						// this is non prime members
						if (age > 60) {
							// 3%
						} else {
							// 2%
						}
					}
//					if (primeMember == true && age > 40) {
//						// 5 + 1 = 6% discount
//						System.out.println(price * 0.06);
//					} else if (primeMember == true && age > 30) {
//						// 5 + 2 = 7% discount
//						System.out.println(price * 0.07);
//					} else if (primeMember == true && age > 20) {
//						// 5 + 3 = 8% discount
//						System.out.println(price * 0.08);
//					} else if (primeMember  == false && age > 60 ) {
//						// 2 + 1 = 3% discount
//						System.out.println(price * 0.03);
//					} else if (primeMember == false && age <= 60) {
//						// 2% discount
//						System.out.println(price * 0.02);
//					}					
					
					// create 3 booleans 1. idPresent 2. ageLimit 3. balancePaid
					// if ageLimit is true, id is true, balancePaid is true, print sell
					// if ageLimit is true, id is true, balancePaid is not true, print not enough balance on card
					// if ageLimit is true, id is not true, print no id needed
					// if ageLimit is not true, print age limit is not met
				boolean idPresent= true;
				boolean ageLimit = true;
				boolean balancePaid= true;
				
				if
				if (ageLimit== true && idPresent == true && balancePaid == true) {
					
					System.out.println("Sell");
					
				}else if(ageLimit== true && idPresent== true && balancePaid==false) {
					System.out.println("not enough balance on card");
				
				}else if ( ageLimit ==true && idPresent == false) {
						System.out.println("no id needed");
						
						
						// other way to do this, Nested If
			
						// create 3 booleans 1. idPresent 2. ageLimit 3. balancePaid +++
						// if ageLimit is true, id is true, balancePaid is true, print sell
						// if ageLimit is true, id is true, balancePaid is not true, print not enough
						// balance on card
						// if ageLimit is true, id is not true, print id needed +++
						// if ageLimit is not true, print age limit is not met ++
						boolean idPresent = true;
						boolean ageLimit = true;
						boolean balancePaid = true;
						if (ageLimit) {
							// within age limit
							if (idPresent) {
								// we have an ID
								if (balancePaid) {
									// all conditions are true
									System.out.println("Sell");
								} else {
									// balance not paid
									System.out.println("Not enough balance on card");
								}
							} else {
								// No Id
								System.out.println("ID Needed!");
							}
						} else {
							// age limit not met
							System.out.println("Age Limit is not met!");
							//// another project
							boolean needToEat = true;
							double budget = 50;
							int time = 70;
					​
							if (needToEat) {
								// need to eat is true
								if (time > 60) {
									// time > 60
									if (budget > 20 && budget < 30) {
										System.out.println("Sandwich");
									} else {
										if (budget > 30) {
											System.out.println("Fancy");
										} else {
											System.out.println("Eggs");
										}
									}
					​
								} else {
									// time < 60
									if (budget > 100) {
										System.out.println("cook fancy");
									} else {
										System.out.println("cook fast");
									}
								}
					​
							} else {
								// need to eat is false
								if (budget > 10 && time > 50) {
									System.out.println("Ice Cream");
								} else {
									System.out.println("Work");
						
						
				
				
					
					
					
					
				}	
					
					
				}		
					
		
				
				
				
		}
				}
				
			
		
	

	


