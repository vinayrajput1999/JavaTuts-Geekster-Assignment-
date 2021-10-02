import java.util.*;
public class CheckNumOR {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for check");
		int n = s.nextInt();
		int c = 1;
		s.close();
		
		if((n|c)>n) {
			System.out.println("the number is even");}
			else {
				System.out.println("the number is odd");
			
		}

	}

}
