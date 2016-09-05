import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] a = { 1, 5, 8, 22, 777, 24, 53, 3, 2 };

		int min = 0, imin = 0, tmp = 0;

		for (int i = 0; i < a.length; i++) {
			tmp = 0;
			min = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					imin = j;
				}
			}
			tmp = a[i];
			a[i] = a[imin];
			a[imin] = tmp;

		}

		System.out.println(Arrays.toString(a));

	}

}
