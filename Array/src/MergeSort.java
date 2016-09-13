import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int[] a = { 1, 1000,100000, 2000, 777 };
		int[] b ={ 4,5,6,7};
		int[] c = new int[a.length+b.length];
		//System.out.println(Arrays.toString(merge(a,b,c)));
		System.out.println(Arrays.toString(sort(a)));
	
	}

	public static int[] sort(int[] arr)
	{
		
		int n = arr.length;
		
		if(n<2)return arr;
			
		
		int mid = (arr.length-1)/2;
		int[] left = new int[mid+1];
		
		int[] right = new int[n-mid-1];
		
		for(int i =0 ; i< mid+1 ; i++)
			left[i] = arr[i];
		for(int i =mid+1 ; i< n ; i++)
			right[i-mid-1] = arr[i];
		
		sort(left);
		sort(right);
		merge(left,right,arr);
		
		return arr;
		
	}
	
	public static int[] merge(int[] left, int[] right ,int[] arr)
	{
		
		int i=0,j=0,k=0;
		
		while(i < left.length && j< right. length)
		{
			if(left[i] <= right[j])
			{
				arr[k]=left[i];
				i++;
			}
			else
			{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<left.length)
		{
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			arr[k] = right[j];
			j++;
			k++;
		}
		
		return arr;
		
		
	}
}
