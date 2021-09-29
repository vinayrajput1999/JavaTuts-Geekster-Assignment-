
public class MinMax {
	
public static void main(String[] args) {
		
		int x[]={84,83,98,12,34,2,31,3,13,56,23,75,8,3,9,20,90,};
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
		}
		System.out.println("max is "+max);
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]<min)
			{
				min=x[i];
			}
			
			
		}
		System.out.print("max is "+min);
		


	}


}
