import java.util.*;
public class ValidatePerson {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		sc.close();
		
		boolean flag = validateAge(age);
		
		if (flag == true) {
			System.out.println("can vote");
		}
		else {
			System.out.println("can't vote");
		}
	}
	
	public static boolean validateAge(int age) {
		if (age >= 18) {
			return true;
		}
		else {
			return false;
		}
	}
}
