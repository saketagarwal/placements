import java.util.Arrays;

public class stringsnbits {
	static int[] A = new int[3];

	public static void main(String[] args) {
		Binary(3);
	}
	
	public static void Binary(int n){
		if(n<1)
			System.out.println(Arrays.toString(A));
		else{
			A[n-1]=0;
			Binary(n-1);
			A[n-1]=1;
			Binary(n-1);
			
		}
	}
	
	
}
