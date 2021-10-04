
public class NonRepNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,4,2,45,5,3,45,3,2,5,3,};
		for(int i=0; i<arr.length;i++) {
			int count = 1;
			for(int j=0; j<arr.length;j++) {
				if((arr[i]^arr[j])==0 && i!=j) {
					count++;
				}
			}
			if(count ==1) {
				System.out.println(arr[i]);
			}
		}
	}
}


