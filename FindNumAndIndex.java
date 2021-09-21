
public class FindNumAndIndex {
	
	 public static void main(String args[]) {
		 int x[] = {91,98,97,13,67,26,98,76,45,35,45,65,76,34,45};
		 boolean flag=false;
		 int y=35;
		 for(int i=0;i<x.length;i++)
		 {
			 if(x[i]==y)
			 {
				 
				 flag=true;
				 System.out.println("NUMBER is present in the array at index no " +i);
			 }
		 }
	 }
}
