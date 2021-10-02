import java.util.*;
public class AndOrOpr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value for n");
		int n = s.nextInt();
		System.out.println("Enter value for m");
		int m = s.nextInt();
		s.close();
		
		System.out.println("AND operation " +(n&m));
		System.out.println("OR operation " +(n|m));

	}

}
