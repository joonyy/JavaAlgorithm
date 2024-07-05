package Basic;

import java.util.Scanner;

public class BOJ2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int total = A*B*C;
        int[] nums = new int[10];
        int size = total;
        for(int i = 0;i<numSize(size);i++){
            nums[total%10]++;
            total/=10;
        }
        for(int i=0;i<10;i++){
            System.out.println(nums[i]);
        }
    }
    static int numSize(int n){
        int ret = 0;
        while(n/10 != 0){
            n/=10;
            ret++;
        }
        return ret+1;
    }
}
