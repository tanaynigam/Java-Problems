import java.util.Arrays;

public class DivFreed2 {
    public static int count(int n, int k){
        long[] dp = new long[k + 1];
        long[] prev = new long[k + 1];
        long mod = 1_000_000_007;
        long[] div = new long[k + 1];
        long[] sum = new long[k + 1];
        for(int i = 1; i <= k; i++) {
            sum[i] = 1;
        }
        prev[1] = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= k; j++) {
                dp[j] = sum[j];
            }
            for(int j = 1; j <= k; j++) {
                dp[j] = (dp[j] + addMod(sum[k] - sum[j], -div[j], mod)) % mod;
            }
            Arrays.fill(div, 0);
            for(int j = 1; j <= k; j++) {
                for(int z = 2 * j; z <= k; z += j) {
                    div[j] = (div[j] + dp[z]) % mod;
                }
            }
            Arrays.fill(sum, 0);
            for(int j = 1; j <= k; j++) {
                sum[j] = (sum[j - 1] + dp[j]) % mod;
            }

            System.arraycopy(dp, 0, prev, 0, k + 1);
        }
        long ans = 0;
        for(long v : prev) {
            ans = (ans + v) % mod;
        }
        return (int)ans;
    }

    public static long addMod(long a, long b, long mod) {
        return ((a + b) % mod + mod) % mod;
    }
}
