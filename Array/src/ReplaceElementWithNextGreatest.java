import java.util.Arrays;

public class ReplaceElementWithNextGreatest {
	
	public static void main(String[] args) {
		int[] a = {16, 17, 4, 3, 5, 2};
		
		int max = a[a.length-1];
		
		for(int i = a.length-2 ; i>=0 ; i--)
		{	int tmp= a[i];
			a[i] = max;
			if(tmp>max)
				max=tmp;
			
		}
		
		a[a.length-1] = -1;
		System.out.println(Arrays.toString(a));
	}

}
