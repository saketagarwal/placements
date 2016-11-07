package test;

public class SwapOddEvenBits {
	public static void main(String[] args) {
		
	
	int a = 23;
	int m =1,n=1;;
	int s=0;
	
	for(int i = 1 ; i<=4; i++)
	{
		s = a&m;
		int first = (s>0)?1:0;
		m = m<<1;
		s=a&m;
		int second = (s>0)?1:0;
		if(first != second)
		{
			a = a ^ n;
			n = n<<1;
			a= a^n;
			n= n<<1;
		}
		else
			n = n <<2;
		
		m = m<<1;
		
	}
	System.out.println(a);
	
	
	}
}
