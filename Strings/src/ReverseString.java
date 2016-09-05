import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		
	
		String input = s.nextLine();
		
		String output = " ";
	
		output.concat("sasas");
		
		for(int i = input.length()-1 ; i >=0 ; i--)
		{
		
		System.out.print(input.charAt(i));
		
		}
		
	}

}
