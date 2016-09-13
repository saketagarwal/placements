
public class Faltu {
	public static void main(String[] args) {
		String a= "abcabc";
		a=a.replace(Character.toString(a.charAt(0)),"");
		System.out.println(a);
		
	}

}
