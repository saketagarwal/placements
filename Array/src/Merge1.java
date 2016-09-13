import java.util.Arrays;

public class Merge1 {

    public static void main(String[] args) {
        int[] a = { 2, 5, 7, 9, 14 };
        int[] b = { 3, 4, 6, 8, 20, 0, 0, 0, 0, 0 };
        int i = 4;
        int j = 4;
        int k = 9;
        while (i >= 0 && j >= 0) {
            if (a[i] >= b[j]) {
                b[k] = a[i];
                i--;
            } else {
                b[k] = b[j];
                j--;
            }
            k--;
        }
        
        while(i>=0)
        {
        b[k] = a[i];
        i--;
        k--;
        }
         while(j>=0)
        {
        b[k] = b[j];
        j--;
        k--;
        }
        System.out.println(Arrays.toString(b));
    }

}