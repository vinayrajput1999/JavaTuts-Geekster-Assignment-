
public class Occurence {
	
	public static void main(String[] args) {
		int a[] = {20, 10, 30, 10, 30};
		System.out.println("number occured only once ");
		check(a);
	}
	
public static void check(int[] a) {
		
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(j!=i) {
					if(a[j]!=a[i]) {
						flag=true;
					}
					else {
						flag=false;
						break;
					}
					
				}
				
			}
			if(flag==true) {
				System.out.println(a[i]);
			}
		}
		
	}
}
