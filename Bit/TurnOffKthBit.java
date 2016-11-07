package test;

public class TurnOffKthBit {

	public static void main(String[] args) {
		
		int n =16 , m=1 , k=3;
		
		for(int i =1 ; i<=k ; i++ )
		{
			m = m <<1;
		}
		int s = n&m;
		if(s>0)
			n = n^m;
		
		System.out.println(n);
		
	}
}
