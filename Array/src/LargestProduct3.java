// time complexity : O(nlogn) 

package test;

import java.util.Arrays;

public class LargestProduct3 {

	public static void main(String[] args) {

		int[] a = { 1, -4, 3, -6, 7, 0 };
		int n = a.length;
		int sorted[] = sort(a);
		System.out.println(Arrays.toString(sorted));

		int pro1 = a[n - 1] * a[n - 2] * a[n - 3];

		int pro2 = a[0] * a[1] * a[n - 1];

		if (pro1 > pro2)
			System.out.println(pro1);
		else
			System.out.println(pro2);

	}

	public static int[] sort(int[] arr) {
		int n = arr.length;

		if (n < 2)
			return arr;

		int mid = n / 2;

		int[] left = new int[mid];

		int[] right = new int[n - mid];

		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}

		for (int j = 0; j < right.length; j++) {
			right[j] = arr[j + mid];
		}

		sort(left);
		sort(right);
		merge(left, right, arr);

		return arr;

	}

	public static int[] merge(int[] left, int[] right, int[] arr) {

		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			}

			else {
				arr[k] = right[j];
				j++;
			}

			k++;
		}

		while (i < left.length) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < right.length) {
			arr[k] = right[j];
			j++;
			k++;
		}

		return arr;

	}

}
