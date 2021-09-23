
public class AppStudent {
	
	public static void main(String[] args) {
		
		Student Amit = new Student();
		
		Amit.setStudentId(101);
		Amit.setStudentName("Amit Roy");
		Amit.setStudentClass("10th");
		Amit.setStudentCity("Delhi");
		
		Student Bimla = new Student();
		
		Bimla.setStudentId(202);
		Bimla.setStudentName("Bimla Bajaj");
		Bimla.setStudentClass("12th");
		Bimla.setStudentCity("Pune");
		
		Student Chetna = new Student();
		
		Chetna.setStudentId(303);
		Chetna.setStudentName("Chetna Deshpandey");
		Chetna.setStudentClass("11th");
		Chetna.setStudentCity("Indore");
		
		Student Dev = new Student();
		
		Dev.setStudentId(404);
		Dev.setStudentName("Dev Pandit");
		Dev.setStudentClass("8th");
		Dev.setStudentCity("Shimla");
		
		Student Ezra = new Student();
		
		Ezra.setStudentId(505);
		Ezra.setStudentName("Ezra Rehman");
		Ezra.setStudentClass("12th");
		Ezra.setStudentCity("Kashmir");
		
		System.out.println(Amit.getStudentId());
		System.out.println(Amit.getStudentName());
		System.out.println(Amit.getStudentClass());
		System.out.println(Amit.getStudentCity());
		System.out.println(" ");
		
		System.out.println(Bimla.getStudentId());
		System.out.println(Bimla.getStudentName());
		System.out.println(Bimla.getStudentClass());
		System.out.println(Bimla.getStudentCity());
		System.out.println(" ");
		
		System.out.println(Chetna.getStudentId());
		System.out.println(Chetna.getStudentName());
		System.out.println(Chetna.getStudentClass());
		System.out.println(Chetna.getStudentCity());
		System.out.println(" ");
		
		System.out.println(Dev.getStudentId());
		System.out.println(Dev.getStudentName());
		System.out.println(Dev.getStudentClass());
		System.out.println(Dev.getStudentCity());
		System.out.println(" ");
		
		System.out.println(Ezra.getStudentId());
		System.out.println(Ezra.getStudentName());
		System.out.println(Ezra.getStudentClass());
		System.out.println(Ezra.getStudentCity());
		System.out.println(" ");
	}

}
