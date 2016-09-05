import java.util.Scanner;

public class ReverseStringEachWord {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a string : ");

		String[] input = s.nextLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0 ;  i<input.length ; i++)
		{
			for(int j =input[i].length()-1; j>=0;j--)
			{
				sb.append(input[i].charAt(j));
			}
			sb.append(" ");
		}
		String output = sb.toString();
		System.out.println(output);

	}
}
