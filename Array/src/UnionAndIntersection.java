import java.util.ArrayList;
import java.util.Arrays;

public class UnionAndIntersection {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 2, 3, 4 };
		int[] a2 = { 5, 6, 2, 7, 8, 5, 4, 8 };

		Integer[] a = union(a1, a2);
		System.out.println(Arrays.toString(a));
		Integer[] b = intersection(a1, a2);
		System.out.println(Arrays.toString(b));

	}

	public static Integer[] union(int[] a1, int[] a2) {
		String s1 = "", s2 = "";
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i : a1)
			s1 = s1.concat(String.valueOf(i));
		for (int i : a2)
			s2 = s2.concat(String.valueOf(i));

		while (s1.isEmpty() == false) {
			ar.add(Integer.parseInt(String.valueOf(s1.charAt(0))));
			char ch = s1.charAt(0);
			for (int i = 0; i < s1.length(); i++) {

				if (ch == s1.charAt(i)) {
					s1 = s1.replace(String.valueOf(s1.charAt(i)), "");
				}
			}
			for (int i = 0; i < s2.length(); i++) {

				if (ch == s2.charAt(i)) {
					s2 = s2.replace(String.valueOf(s2.charAt(i)), "");
				}
			}

		}

		while (s2.isEmpty() == false) {
			ar.add(Integer.parseInt(String.valueOf(s2.charAt(0))));
			char ch = s2.charAt(0);

			for (int i = 0; i < s2.length(); i++) {

				if (ch == s2.charAt(i)) {
					s2 = s2.replace(String.valueOf(s2.charAt(i)), "");
				}
			}

		}

		Integer[] a = new Integer[ar.size()];
		a = ar.toArray(a);
		return a;

	}

	public static Integer[] intersection(int[] a1, int[] a2) {
		String s1 = "", s2 = "";
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i : a1)
			s1 = s1.concat(String.valueOf(i));
		for (int i : a2)
			s2 = s2.concat(String.valueOf(i));

		while (s1.isEmpty() == false) {

			char ch = s1.charAt(0);
			for (int i = 0; i < s1.length(); i++) {

				if (ch == s1.charAt(i)) {
					s1 = s1.replace(String.valueOf(s1.charAt(i)), "");
				}
			}
			for (int i = 0; i < s2.length(); i++) {

				if (ch == s2.charAt(i)) {
					ar.add(Integer.parseInt(String.valueOf(ch)));
					s2 = s2.replace(String.valueOf(s2.charAt(i)), "");
				}
			}

		}

		Integer[] a = new Integer[ar.size()];
		a = ar.toArray(a);
		return a;

	}

}
