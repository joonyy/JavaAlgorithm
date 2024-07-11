package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        int Max = Integer.MIN_VALUE;
        for(int i = 0 ; i<3; i++){
            num[i] = sc.nextInt();
            if(Max<num[i]) Max = num[i];
        }
        Arrays.sort(num);
        int sum = 0;
        if(num[2]==num[1] && num[1]==num[0]){
            sum = 10000 + Max * 1000;
        }else if(num[2]==num[1]){
            sum = 1000 + Max * 100;
        }else if(num[1]==num[0]){
            sum = 1000 + num[1] * 100;
        }else{
            sum = Max * 100;
        }
        System.out.println(sum);
    }
}
