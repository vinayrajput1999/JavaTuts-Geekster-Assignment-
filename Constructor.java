
public class Constructor {
	
	private int id;
	private String name;
	
	public Constructor(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void show() {
		System.out.println("id " +id + " name " +name);
	}

}
