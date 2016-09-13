
public class MajorityElement 
{
	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 1, 1, 1, 53, 3, 2 };
		int flag = 0;
		
		for(int i = 0; i<a.length ; i++)
		{int count = 0;
			for(int j = 0 ; j < a.length ; j++)
			{
				if(a[j] == a[i])
					count++;
			}
			if(count > (a.length/2))
			{
				flag=1;
				System.out.println(a[i]);
				break;
			}
		}
		if(flag == 0)
			System.out.println("null");
	}

}
