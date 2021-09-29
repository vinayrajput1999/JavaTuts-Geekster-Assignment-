
public class Student {
	
	private int studentId;
	private String studentName;
	private String studentClass;
	private String studentCity;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	public String getStudentName() {
		return this.studentName;
	}
	public String getStudentClass() {
		return this.studentClass;
	}
	public String getStudentCity() {
		return this.studentCity;
	}
//	constructor example assignment
	public Student(int studentId, String studentName, String studentClass, String studentCity) {
		this.studentId = 101;
		this.studentName = "Simran Yadav";
		this.studentClass = "12th";
		this.studentCity = "Delhi";
		
	}
	public void show() {
		System.out.println("student Id "+this.studentId);
		System.out.println("student Name "+this.studentName);
		System.out.println("student Class "+this.studentClass);
		System.out.println("student City "+this.studentCity);
	}
	
}
