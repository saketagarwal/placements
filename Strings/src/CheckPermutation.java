// another way- sort both the strings and check if equal (net se)
public class CheckPermutation {
	
	public static void main(String[] args) {
		
		String s1 = "abcdef";
		String s2 = "eabdcfg";
		
		while(s1.isEmpty() == false)
		{
			s2 = s2.replace(Character.toString(s1.charAt(0)),"");
//			System.out.println(s2);
			s1 = s1.replace(Character.toString(s1.charAt(0)),"");
//			System.out.println(s1);
		}
		
		if(s2.isEmpty())
			System.out.println("yes");
	
		else
			System.out.println("no");
	
	}

}
