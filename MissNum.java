
public class MissNum {
	
	public static void main(String args[]) {
		int[] list = {1,2,3,4,5,6,7,8,9,11,12,13,14,15};
		int liSum=0;
		int n=15;
		int sum = (n*(n+1))/2;
		for(int i=0;i<list.length;i++){
			liSum=liSum+list[i];
		}
		n=sum-liSum;
		System.out.println("Missing Number " + n);
	}

}
