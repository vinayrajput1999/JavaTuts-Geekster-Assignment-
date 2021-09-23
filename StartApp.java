
public class StartApp {
	
	public static void main(String[] args) {
		
		User ashutosh = new User();
		
		ashutosh.setUserId(1);
		ashutosh.setUserName("ashutosh12");
		ashutosh.setFirstName("ashutosh");
		ashutosh.setLastName("jena");
		
		
	    User sanjay = new User();
	    sanjay.setFirstName("sanjay");
	    sanjay.setLastName("biswa");
	    sanjay.setUserId(2);
	    sanjay.setUserName("sanjay12");
	    
	    
	    System.out.println(ashutosh.getUserId());
	    System.out.println(ashutosh.getUserName());
	    System.out.println(ashutosh.getFirstName());
	    System.out.println(ashutosh.getLastName());
	    
		
		
	}

}
