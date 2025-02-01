import java.util.*;

public class MinimumOperation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n,k, ans = 0;
            n = sc.nextInt();
            k = sc.nextInt();
            if(k == 1){
                System.out.println(n);
                continue;
            }
            while(n != 0){
                ans += n%k;
                n /= k;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}