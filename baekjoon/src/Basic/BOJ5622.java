package Basic;

import java.util.Scanner;

public class BOJ5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;
        for (int i = 0; i<str.length(); i++) {
            int a = str.charAt(i) - 'A';
            if(a<=14) sum += (a/3 + 3);
            else if (a>=15 && a<=18) {
                sum += 8;
            } else if (a>=19 && a<=21) sum += 9;
            else sum += 10;
        }
        System.out.println(sum);
    }
}
