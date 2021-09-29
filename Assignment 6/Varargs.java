
public class Varargs {
     public static void main(String[] args) {

		int x=65;
		int y=56;
		
		Varargs vrg=new Varargs();
		int sum=vrg.varArg(x,y,76,34,2,3,4);
		System.out.print("Sum = "+sum);	

	}
	public int varArg(int a,int b,int ...c) {
		int sm=0;
		for(int i=0 ;i<c.length;i++) {
			sm=sm+c[i];
			
		}
		
		return sm+a+b;
	}

}
