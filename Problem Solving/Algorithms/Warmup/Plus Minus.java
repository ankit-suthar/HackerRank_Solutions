import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        int n = arr.length;
        double p = 0;
        double neg = 0;
        double z = 0;
        double n1=0.0;
        double n2=0.0;
        double n3=0.0;
        
        for(int i=0;i<n;i++)
        {   
            if(arr[i]>0)
                p++;
            else if(arr[i]<0)
                neg++;
            else
                z++;      
        }
                
        
        System.out.println(p/n+"");
        System.out.println(neg/n+"");
        System.out.println(z/n+"");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}

