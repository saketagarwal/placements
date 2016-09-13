import java.util.Scanner;

public class Panagrams {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		s1=s1.toLowerCase();
		s1= s1.replace(" ","");
		
		int count=0;
		while(s1.isEmpty()==false)
		{
			s1 = s1.replace(Character.toString(s1.charAt(0)),"");
			count++;
		}

		if(count ==26)
			System.out.println("Panagram");
		else
			System.out.println("not a Panagram");
	}
	
}
