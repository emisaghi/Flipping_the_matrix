import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int q = stdin.nextInt();
        for(int m=0;m<q;m++){
            int n=stdin.nextInt();
            int[][] a = new int[2*n][2*n];
            for(int i=0;i<2*n;i++){
                for(int j=0;j<2*n;j++){
                    a[i][j] = stdin.nextInt();
                }
            }
            int sum=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int maxq=Math.max(Math.max(Math.max(a[i][j], a[i][2*n-j-1]), a[2*n-i-1][j]), a[2*n-i-1][2*n-j-1]);
                    sum+=maxq;
                }
            }
            System.out.println(sum);
    }
            
        
}
}
