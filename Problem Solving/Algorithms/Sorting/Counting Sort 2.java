import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] countingSort(int[] arr) {
        
        int p[] = new int[100];
        
        int ans[] = new int[arr.length];
        
        for(int i=0;i<100;i++)
            p[i]=0;
        
        for(int i=0;i<arr.length;i++)
            p[arr[i]]++;
        
        int j=0;
        
        for(int i=0;i<100;i++)
        {
            while(p[i]>0)
            {
                ans[j] = i;
                j++;
                p[i]--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = countingSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
