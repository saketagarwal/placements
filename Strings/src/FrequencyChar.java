
public class FrequencyChar {

	public static void main(String[] args) {
		
		String s = "elephant";
		int count1 = 0,count2=0,max=0;
		char c=' ',ch=' ';
		
		while(s.isEmpty() == false)
		{
			count1 = s.length();
			ch=s.charAt(0);
			s=s.replace(Character.toString(s.charAt(0)), "");
			count2 = s.length();
			if(count1-count2 >max)
			{
				max = count1-count2;
				c = ch;
			}
				
		}
		
		String f = String.format("%c appears %d times",c,max);
		
		System.out.printf("%c appears %d times\n",c,max);
		System.out.println(f);
	}
	
	
}
