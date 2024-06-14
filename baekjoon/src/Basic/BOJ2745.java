package Basic;

import java.util.Scanner;

public class BOJ2745 {
    static int square(int n){
        return n*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i =0;i<5;i++){
            sum += square(sc.nextInt());
        }
        System.out.println(sum % 10);
    }
}