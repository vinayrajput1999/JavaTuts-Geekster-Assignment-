import java.util.*;
public class FindMinMax {

	public static void main(String[] args) {
			  Scanner s=new Scanner(System.in);
		       int inpt[]=new int[5];
		      System.out.println("Enter array Values");
		      for(int i=0;i<5;i++) {
			  inpt[i]=s.nextInt();
		      }
		      int max=0;
		      for(int i=0;i<5;i++) {
		    	  if(inpt[i]>max) {
		    		  max=inpt[i];
		    	  }
		      }
		      System.out.println("greatest element  "+max);
		}
}
