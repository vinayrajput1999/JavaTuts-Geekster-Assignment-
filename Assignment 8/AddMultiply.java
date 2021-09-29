import java.util.*;
public class AddMultiply {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter numbers A and B");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("what operation you want to do.");
		System.out.println("For Sum Press 1 ");
		System.out.println("For MUltiply Press 2 ");
		int x = sc.nextInt();
		sc.close();
		
		if(x == 1) {
		int sum = add(a,b);
		
		System.out.println("sum "+sum);
		
		
		
		if(x == 2) {
		
			
		int multiply = multiply(a,b);
			
		System.out.println("multiplication " +multiply);
			
		}
		}
		else {
			System.out.println("Press valid number");
		}
		
		
		

	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}

}
