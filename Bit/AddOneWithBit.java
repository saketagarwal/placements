package test;

public class AddOneWithBit {
	
	public static void main(String[] args) {
		
		int a = 1355,m =1;
		int b = a&m;
		
		while(b>0)
		{
			a = a ^ m;
			m = m<<1;
			b=a&m;
		}
		
		a= a^m;
		
		System.out.println(a);
		
	}

}
