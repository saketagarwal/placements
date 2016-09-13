import java.util.Arrays;

public class Faltu {

	
	
	public static void main(String[] args) {
		int[] a = { 1, 4, 7, 8, 11, 45, 67 };
//		System.out.println(Arrays.toString(a));
		
		String b = "sasa";
		String c= "";
		
		for(int i = 0 ; i<4 ; i ++)
			c=c.concat(String.valueOf(b.charAt(i)));
		
		for(int i : a)
		{
			c=c.concat(String.valueOf(i));
		}
		
		System.out.println(c);
	}
	
}
