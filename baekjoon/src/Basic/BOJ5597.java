package Basic;

import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args) {
        int[] arr = new int[31];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<28;i++){
        int k = sc.nextInt();
        arr[k]++;
        }

        for(int i=1;i<=30;i++){
            if(arr[i] == 0) System.out.println(i);
        }
    }
}
