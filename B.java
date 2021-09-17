import java.util.Scanner;

public class B {
	
//	for Static (Comment out sum)
	
	public static void add(int x, int y) {
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("First Number is " +x);   
		System.out.println("Second Number is " +y);
		System.out.println(x+y);
		
		sc.close();
		
	}
	
	public void sum(int x, int y) {  
		
//		for Non-Static (Comment out add)
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("First Number is " +x);
		System.out.println("Second Number is " +y);
		System.out.println(x+y);
		
		sc.close();
		
	}

}
