package Basic;

import java.util.*;
import java.io.*;

public class BOJ2751 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for(int i = 0; i<N;i++) {
            arr[i] =Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i =0; i<N; i++){
            System.out.println(arr[i]);
        }
    }
}
