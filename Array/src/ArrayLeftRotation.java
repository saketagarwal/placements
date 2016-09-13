import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner s = new Scanner(System.in);
        String[] nd = new String[2];
        nd = s.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];
        int j=0;
        String[] sa = new String[n];
        sa = s.nextLine().split(" ");
        for(String i : sa){
        	a[j] = Integer.parseInt(i);
        	j++;
        }
        	
        int[] b = new int[n];
        
        for(int i = 0;i<n ; i++)
            {
            if(i<d)
                b[n-d+i]=a[i];
            else
                b[i-d]=a[i];
        }
        for(int z:b)
        System.out.print(z + " ");
    
    }
}
