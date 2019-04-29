import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        
        int n = arr.length;
        long min = 0;
        long max = 0;
        for(int i=0;i<n;i++)
        {
            if(i!=n-1)
                min = min + arr[i];
            
            if(i!=0)
                max = max + arr[i];                
        }
        
        System.out.println(min+" "+max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
