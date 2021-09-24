
public class CallByValue {
	
	public static void main(String[] args) {
		int[] arr= {21,65,32,93,16,92,80};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		add(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}
	public static void add(int[] arr) {
		
		arr[6]=arr[5]+3;
	}

}
