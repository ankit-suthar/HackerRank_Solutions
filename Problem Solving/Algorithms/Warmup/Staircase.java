import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        int k;
        for(int i=1;i<=n;i++)
        {
            k = n;
            while(k-i>0)
            {
                System.out.print(" ");
                k--;
            }
            
            for(int j=1;j<=i;j++)
                System.out.print("#");                
            
            System.out.println();                
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}

