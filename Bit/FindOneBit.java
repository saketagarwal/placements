package test;

public class FindOneBit {
	
	public static void main(String[] args) {
		
		int n = 32, m =1 ,count =0;
		
		while(true)
		{
			int s = n&m;
			
			if(s!=0)
			{
				System.out.println(count);
				break;
			}
			
			m = m <<1;
			count++;
			
		}
		
	}

}
