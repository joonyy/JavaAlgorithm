package Array_List;

import java.util.Scanner;

public class BOJ11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        char[] cNum = str.toCharArray();
        int sum = 0;
        for(int i = 0; i<str.length() ;i++){
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}
