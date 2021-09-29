
public class Duplicate {
	
public static void main(String[] args) {
		
		int[] arr= {2,4,56,3,2,4,5,3,5,6,7};
		
		for(int i=0;i<arr.length;i++)
		{
			int n=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==n)
				{
					System.out.println(arr[j]+" Duplicate");
					
				}
			}	
		}
	}
}
