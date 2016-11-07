package test;

public class SquareWithBit {
	
	
	public static void main(String[] args) {
		
		int n = 7; 

		int sq = square(n);
		System.out.println(sq);
		
	}
	
	public static int square(int n)
	{
		int x = n>>1;
		
		if(n == 0)
			return 0;
		
		if( n ==1)
			return 1;
		
		int s = n&1;
		
	
		
		if(s==0)
			return (square(x)<<2);
		
		else
			return ((square(x)<<2) + (x<<2) + 1);
		
	
		
	}
	
	

}
