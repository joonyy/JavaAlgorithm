package Basic;

import java.util.Scanner;

public class BOJ1929 {
    static boolean[] isPrime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        isPrime = new boolean[N+1];
        setIsPrime();
        for(int i = M; i <= N ; i++){
            if(!isPrime[i]) System.out.println(i);
        }
    }
    public static void setIsPrime(){
        isPrime[0] = true;
        isPrime[1] = true;
        for(int i = 2; i<= Math.sqrt(isPrime.length); i++){
            if(isPrime[i]) continue;
            for(int j = i*i; j<isPrime.length; j=j+i){
                isPrime[j] = true;
            }
        }
    }
}
