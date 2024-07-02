package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10809 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] alphabet = new int[26];
        String S = sc.next();
        Arrays.fill(alphabet, -1);
        for(int i=0;i<S.length();i++){
            if(alphabet[S.charAt(i)-97] !=-1) continue;
            else alphabet[S.charAt(i)-97] = i;
        }
        for(int i = 0; i<26;i++){
            System.out.print(alphabet[i] + " ");
        }
    }
}
