package Basic;

import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[9];
        int max = -100;
        int idx = -1;
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max) {
                max = arr[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx+1);
    }
}
