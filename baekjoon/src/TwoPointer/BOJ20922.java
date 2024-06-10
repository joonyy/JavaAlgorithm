package TwoPointer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class BOJ20922 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int max_length = 0;
        int start = 0;
        int end=0;
        int[] num = new int[100001];
         int[] arr = new int[N];
         st = new StringTokenizer(in.readLine());
        for(int i=0;i<N;i++){
            arr[i] =  Integer.parseInt(st.nextToken());
        }
        while (end<N){
            num[arr[end]]++;

            if(num[arr[end]]>K){
                max_length = Math.max(max_length, end-start);
                while(num[arr[end]]>K){
                    num[arr[start]]--;
                    start++;
                }
            }
            end++;
        }
        max_length = Math.max(max_length, end-start);
        System.out.println(max_length);
    }
}
