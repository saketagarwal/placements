// time complexity : O(n) space complexity : O(1)


package test;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4,5,6};
		int n  = arr.length;
		
		for(int i =0 ; i<n/2 ; i++)
		{
			swap(arr,i,n-1-i);		
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	

	public static int[] swap(int[] a, int i ,int j)
	{
		a[i] = a[i] + a[j];
		a[j] = a[i] - a[j];
		a[i] = a[i] - a[j];
		
		return a;	
	}
	
	
}
