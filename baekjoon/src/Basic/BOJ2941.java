package Basic;

import java.util.Scanner;

public class BOJ2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(parseString(str));
    }
    static int parseString(String str){
        int cnt = 0;
        int i = 0;

        while(i < str.length()){
            if(i < str.length() - 2 && str.substring(i,i+3).equals("dz=")){
                cnt++;
                i += 3;
            }else if(i < str.length() - 1){
                String temp = str.substring(i, i+2);
                if(temp.equals("c=") ||temp.equals("c-") || temp.equals("d-") || temp.equals("lj") || temp.equals("nj") || temp.equals("s=") || temp.equals("z=") ) {
                cnt++;
                i += 2;
                }else{
                    cnt++;
                    i++;
                }
            }else {
                cnt++;
                i++;
            }
        }
        return cnt;
    }
}
