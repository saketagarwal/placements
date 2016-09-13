
public class SubarraySum {

	public static void main(String[] args) {
		
	
	int arr[] = {1, 4, 20, 3, 10, 5};
	
	int sum =33;
	int flag =0;
	
	int s =arr[0];
	int si=0,ei=0;
	
	
	for(int i = 1; i<arr.length ; i++)
	{
		if(s == sum ){
			System.out.println(" " + si + " " + ei);
			flag=1;
			break;
			}
		else if(s < sum){
			s = s +arr[i];
			ei =i;}
		else{
			s=0;
			i=si;
			si++;
		}
		
	}
	if(flag==0)
	{
		System.out.println("not found");
	}
	
}
}

