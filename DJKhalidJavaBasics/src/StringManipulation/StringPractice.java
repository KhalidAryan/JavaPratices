package StringManipulation;

public class StringPractice {

	public static void main(String[] args) {
		String x = "test55" + "";
		String y = "test55";
      x.charAt(2);
      
      
      System.out.println(x.compareTo(y));
      // find the 5th t below through index
      String s = "testing is fun if t is in 4 5 6 7 t the t right2 3 4 5 place t, t, tt, t ";
      System.out.println(s.indexOf('t',32));
      // we can find it into two ways one up and other down
      int temp = 0;
      for( int i =0; i<5; i++) {
    	  temp = s.indexOf('t', temp)+ 1;
    	  System.out.println(temp-1);
      }
	}

}
