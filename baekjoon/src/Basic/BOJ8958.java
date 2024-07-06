package Basic;

import java.util.Scanner;

public class BOJ8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            String s = sc.next();
            int cnt = 1;
            int sum = 0;
            for(int j = 0; j<s.length();j++){
                char val = s.charAt(j);
                if(val == 'O'){
                    sum+=cnt;
                    cnt++;
                }else{
                    cnt = 1;
                    continue;
                }
            }
            System.out.println(sum);
        }
    }
}
