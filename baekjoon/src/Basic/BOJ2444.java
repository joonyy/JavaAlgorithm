package Basic;

import java.util.Scanner;

public class BOJ2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i<2*N -1 ; i++){
            for(int j=0;j<2*N -1 ; j++){
                if(i<=N-1){
                    if(j<N-i-1){
                        System.out.print(" ");
                    }
                    if(j>=N-1-i && j<=N-1+i)System.out.print("*");
                }
                if(i>N-1){
                    if(j<i+1-N) System.out.print(" ");
                    if(j>=i+1-N && j<3*N -2 - i) System.out.print("*");
                }



                else continue;
            }
            System.out.println("");
        }
    }
}
