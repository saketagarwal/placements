import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		
	
		String input = s.nextLine();
		
		
	
		StringBuilder sb = new StringBuilder();
		
		
		for(int i = input.length()-1 ; i >=0 ; i--)
		{
		
		//System.out.print(input.charAt(i));
			sb.append(input.charAt(i));
		
		}
		String output = sb.toString();
		System.out.println(output);
		
	}

}
