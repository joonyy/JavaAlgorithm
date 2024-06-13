package Basic;

import java.util.Scanner;

public class BOJ10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length()/2;i++){
                if(str.charAt(i) != str.charAt(str.length()-1-i)){
                    System.out.println(0);
                    return;
            }
        }
        System.out.println(1);
        return;

    }
}
