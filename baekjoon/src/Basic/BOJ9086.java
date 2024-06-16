package Basic;

import java.util.Scanner;

public class BOJ9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i= 0;i<T;i++){
            String str = sc.next();
            char first = str.charAt(0);
            char last = str.charAt(str.length() -1);
            System.out.println(""+first+ last);
        }


    }
}
