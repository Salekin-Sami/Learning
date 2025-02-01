import java.util.*;

public class MaximizeMex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t; 
        t = sc.nextInt();
        while(t--> 0){
            int n,x;
            n = sc.nextInt();
            x = sc.nextInt();
            int[] a = new int[n+1];
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if(val <= n) a[val]++;
            }
            int i = 0;
            for(; i <= n; i++){
                if(a[i] == 0) break;
                if(i + x <= n) a[i+x] += a[i] - 1;
            }
            System.out.println(i);
        }
        sc.close();
    }
}