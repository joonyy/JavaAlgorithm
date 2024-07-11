package Basic;

import java.util.Scanner;

public class BOJ1316 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int cnt = 0;
        for(int i = 0; i < N; i++){
            int[] arr = new int[26];
            String str = sc.nextLine();
            for(int j = 1; j<str.length();j++){
                char before = str.charAt(j-1);
                char current = str.charAt(j);
                if(before == current) continue;
                else {
                    if(arr[current - 'a'] == 1){
                        cnt--;
                        break;
                    }else {
                        arr[before - 'a'] = 1;
                    }
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
