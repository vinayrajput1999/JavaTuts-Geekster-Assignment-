import java.util.Scanner;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		double a = sc.nextDouble();
		System.out.println("Enter a Number");
		double a = sc.nextDouble();
		
		System.out.println("Number in Integer "+ (int)a); 
		System.out.println("Number in Float "+ (float)a);
		System.out.println("Number in Double "+ (double)a);
		System.out.println("Number in Long int "+ (long)a);
		System.out.println("Number in Short int "+ (short)a);
		 
		System.out.println("Number in String "+a );
		sc.close();
		
	}
	
}
