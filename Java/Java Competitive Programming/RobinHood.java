import java.util.*;
public class RobinHood{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long sum = 0;   
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            if(n <= 2){
                System.out.println(-1);
                continue;
            }
            Arrays.sort(a);
            long x = Math.max(0l,a[n/2]*2*n - sum+1);
            System.out.println(x);
        }
        sc.close();
    }
}