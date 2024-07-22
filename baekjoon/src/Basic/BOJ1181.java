package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1181 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] stringList = new String[N];
        int cnt = 0;
        for(int i = 0; i<N;i++){
            String str = sc.nextLine();
            boolean duplicate = false;
            for(int j = 0 ; j<cnt; j++){
                if(str.equals(stringList[j])) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                stringList[cnt] = str;
                cnt++;
            }
        }
        String[] sortedList = Arrays.copyOfRange(stringList,0,cnt);
        Arrays.sort(sortedList, (String s1, String s2) -> {
            if(s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }else{
                return s1.compareTo(s2);
            }
        });
        for(int i = 0 ;i<cnt;i++){
            System.out.println(sortedList[i]);
        }
    }
}
