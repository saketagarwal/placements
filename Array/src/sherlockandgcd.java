import java.util.Arrays;
import java.util.Scanner;

public class sherlockandgcd {
	
	  public static void main(String[] args)
	    {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        s.nextLine();
	       // System.out.println(n);
	        for(int i = 0 ; i < n ; i++)
	        {
	            int size =s.nextInt();
	            s.nextLine();
	           // System.out.println(size);
	            String[] s1 = new String[size];
	            int[] arr = new int[size];
	            s1 = s.nextLine().split(" ");
	           // System.out.println(Arrays.toString(s1));
	            int j =0;
	            for(String a : s1){
	                arr[j]=Integer.parseInt(a);j++;}
	            
	           // System.out.println(Arrays.toString(arr));
	            hcf1(arr);
	            
	                
	        }
	        
	        
	    }
	    
	    public static void hcf1(int[] a)
	    {
	        if(a.length ==1)
	            System.out.println("yes");
	        else if(a.length ==0)
	             System.out.println("no");
	        else
	            {
	            int hcf = a[0];
	            for(int i =1 ; i<a.length ;i++)
	                {
	                hcf = hcf2(hcf,a[i]);
	            }
	            if(hcf==1)
	                System.out.println("yes");
	            else
	                System.out.println("no");
	        }
	    }
	    
	   public static int hcf2(int a, int b)
	      {
			  int f=0;
	      if(a>=b)
	          {
	          for(int i=b ; i>=1 ; i--)
	              {
	              if(b%i == 0 && a%i ==0){
	            	  f=1;
	            	  return(i);
	            	
	            
	              }
	          }
	      }
	      else
	          {
	          for(int i=a ; i>=1 ; i--)
	              {
	              if(b%i == 0 && a%i ==0){
	            	  f=1;
	            	  return(i);
	            	
	                 
	              }
	          }
	      }
	      if(f==0)
	    	  return 1;
	      
	      return 0;
	      
	  }
}
