package Basic;

public class BOJ15596 {
    long sum(int[] a) {
        long ans = 0;
        for(long e : a){
            ans += e;
        }
        return ans;
    }
}
