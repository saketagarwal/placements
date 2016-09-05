import java.util.Arrays;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		int[] a = { 1, 5, 8, 22, 777, 24, 53, 3, 2 };
		int tmp =0;
		
		for(int i =1 ; i< a.length ; i++)
		{   
			for(int j=0 ; j<a.length-1 ; j++)
			{	
				if(a[j]>a[j+1]){
					tmp = a[j];
				a[j]=a[j+1];
				a[j+1] = tmp;}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
