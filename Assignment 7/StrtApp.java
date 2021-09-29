import java.util.*;
public class StrtApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Id ");
		int studentId = sc.nextInt();
		System.out.println("");
		System.out.print("Enter Student Name ");
		String studentName = sc.next();
		System.out.println("");
	    System.out.print("Enter Student Class ");
		String studentClass = sc.next();
		System.out.println("");
		System.out.println("Enter Student City");
		String studentCity = sc.next();
		System.out.println("");
				
				
		Student app1 = new Student(studentId, studentCity, studentCity, studentCity);
		app1.show();

		Student app2 = new Student(studentId, studentName, studentClass, studentCity);
		app2.show();
		sc.close();

	}

}
