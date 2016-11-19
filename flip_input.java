import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
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
    }
            
        
}
}
