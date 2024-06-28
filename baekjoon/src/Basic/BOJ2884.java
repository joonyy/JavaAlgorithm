package Basic;

import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int time = 60*H + M;
        if(time<45) time += 24 * 60;
        time -=45;
        System.out.println(time/60 +" "+time%60);
    }
}