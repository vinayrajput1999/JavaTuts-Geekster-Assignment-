import java.util.Scanner;

public class MInElement {
	
	public static void main(String[] args) {
		int value[] = new int[5];
        int min=min(value);
        System.out.println("minimum value in array is " +min);
    }

    private static int min(int[] value)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Array  values ");
        int min=0;
        for(int i=0;i<value.length;i++)

        {
            value[i]=s.nextInt();
            if(i==0)
            {
                min=value[i];
            }
            else
            {
                if(min>value[i])
                    min=value[i];
            }
        }
        return min;
    }

}
