import java.util.*;
public class ElementOccur {

		public static void main(String[] args) {
	       Scanner s=new Scanner(System.in);
	       int inpt[]=new int[5];
	      System.out.println("Enter array values  ");
	      for(int i=0;i<5;i++) {
		  inpt[i]=s.nextInt();
	      }
	      System.out.println("Enter element to search");
	      boolean find=false;
	      int element=s.nextInt();
	      for(int i=0;i<5;i++) {
	    	  if(element==inpt[i]) {
	    		 find=true;
	    	  }
	      }
	      if(find) {
	    	  System.out.println("num is present");
	      }else {
	    	  System.out.println("num is not present");
	      }
	      
	}

}
