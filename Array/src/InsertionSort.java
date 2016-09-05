import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 1, 5, 8, 22, 777, 24, 53, 3, 2 };
		
		for(int i = 1; i<a.length ; i++)
		{
			int value = a[i];
			int hole =i;
			
			while(hole >0 && a[hole-1]>value)
			{
				a[hole]=a[hole-1];
				hole--;
			}
			a[hole] = value;
		}
		
		System.out.println(Arrays.toString(a));
	}
}
