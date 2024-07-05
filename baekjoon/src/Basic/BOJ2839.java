package Basic;

import java.util.Scanner;

public class BOJ2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int firstN = N;
        int sum = 0;

        sum += N / 5;
        N %= 5;

        while(N > 0){
            if(N%3 == 0){//3과 5로 이루어짐
                sum += N/3;
                N = 0;
                break;
            }
            if(sum == 0) break;
            N+=5;
            sum--;
        }
        if(N != 0) sum = -1;
        System.out.println(sum);
    }
}
