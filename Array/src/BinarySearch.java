
public class BinarySearch {

	public static void main(String[] args) {

		int[] a = { 1, 4, 7, 8, 11, 45, 67 };
		int ToFind = 67;

		int first = 0, last = a.length - 1;

		int mid = 0;

		while (last >= first) {
			mid = first + (last - first) / 2;

			if (a[mid] == ToFind) {
				System.out.println(mid);
				break;
			}

			else if (ToFind > a[mid])
				first = mid+1;

			else
				last = mid-1;

		}

		if (first>last)
			System.out.println("not found");

	}

}
