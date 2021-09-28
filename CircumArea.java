import java.util.*;
public class CircumArea {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Radius of Circle");
		int r = s.nextInt();
		System.out.println("What operation you wannt to perform");
		System.out.println("For Circumference of Circle Press 1 ");
		System.out.println("For Area of Circle Press 2 ");
		int x = s.nextInt();
		
		if(x==1) {
			double c = circum(r);
			System.out.println("Circumference of Circle " +c);
			
		    if(x==2) {
			
			double a = area(r);
			System.out.println("Area of Circle " +a);
			
		   }
		}
		
		else {
			System.out.println("input not valid. ");
		}
		

	}
	
	public static double circum(int r) {
		double pi = 3.14;
		return 2*pi*r;
	}
	
	public static double area(int r) {
		double pi = 3.14;
		
		return pi*(r*r);
	}

}
