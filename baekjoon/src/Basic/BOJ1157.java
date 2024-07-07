package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alphabet = new int[26];
        String S = sc.next();
        String text = S.toUpperCase();
        for(int i=0;i<text.length();i++){
            alphabet[text.charAt(i) - 'A']++;
        }
        int max = -1;
        int maxidx = -1;
        for(int i=0;i<alphabet.length;i++){
            if(alphabet[i]>max) {
                maxidx = i;
                max = alphabet[i];
            }
        }
        Arrays.sort(alphabet);
        if(alphabet[25] == alphabet[24]) System.out.println("?");
        else System.out.println((char)(maxidx+'A'));
    }
}
