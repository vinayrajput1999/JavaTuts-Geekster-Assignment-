import java.util.*;
public class AddTwoNum {
	
	public static void main(String[] args) {
		 int[] sum=new int[5];
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter array value:");
	     for(int i=0;i<5;i++) {
	    	 sum[i]=sc.nextInt();
	     }
	     int[] c=new int[5];
	     System.out.println("Enter target element:");
	     int target=sc.nextInt();
	     for(int i=0;i<5;i++) {
	    	 for(int j=i+1;j<5;j++) {
	    		 if(sum[i]+sum[j]==target) {
	    			 c[0]=sum[i];
	    			 c[1]=sum[j];
	    			 break;
	    		 }
	    	 }
	     }
	     System.out.println("Pair elements:");
	     for(int a:c) {
	    	 System.out.println(a);
	     }

	}


}
