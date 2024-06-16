package Basic;

import java.util.Scanner;

public class BOJ25314 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N =sc.nextInt();
        for(int i = 0 ;i<N/4; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
