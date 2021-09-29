import java.util.Scanner;
public class CountChar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name ");
		String a = sc.nextLine();
		sc.close();
		if(a.length()<4) {
			System.out.println("Name is short");
		}else {
			System.out.println("Name is long");
		}
	}
	
	

}
