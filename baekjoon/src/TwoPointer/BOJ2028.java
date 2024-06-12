package TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ2028 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int start = 1;
        int end = 1;
        int count = 0;
        while(end <= N+1){
            if(sum < N){
                sum += end;
                end++;
            }else if(sum > N){
                sum -= start;
                start++;
            }
            else {
                count++;
                sum -= start;
                start++;
            }
        }
        System.out.println(count);
    }
}
