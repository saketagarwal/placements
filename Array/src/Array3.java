import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String[] first = s.nextLine().split(" ");
		int lastAns = 0;
		int[] line1 = null;
		
		
		int n = Integer.parseInt(first[0]);
		
		int m = Integer.parseInt(first[1]);
	
		ArrayList[] a = new ArrayList[n];
		
		for(int i=0 ; i<n ; i++){
			a[i] = new ArrayList<Integer>();
			
		}
		
		s.nextLine();
		
		for(int i=0; i<m ; i++)
		{
			String[] line = s.nextLine().split(" ");
			
			for(int j=0 ; j<3 ; j++)
			{
				line1[j] = Integer.parseInt(line[j]);
			}
			
			if(line1[0] == 1)
			{
				a[((line1[1] ^ lastAns)% n)].add(line[2]);
				
			}
			
			if(line1[0]==2)
			{
				lastAns = line1[2] % (a[((line1[1] ^ lastAns)% n)].size());
				System.out.println(lastAns);
			}
			
			
			
		}
		
		
		
	}
}
