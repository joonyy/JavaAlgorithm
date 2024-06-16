package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ22938 {
    public static long Square(long num){
        return num * num;
    }
    public static void main(String[] args) throws IOException {
        long x1, y1, R1, x2,y2,R2;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        x1 = Long.parseLong(st.nextToken());
        y1 = Long.parseLong(st.nextToken());
        R1 = Long.parseLong(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        x2 = Long.parseLong(st.nextToken());
        y2 = Long.parseLong(st.nextToken());
        R2 = Long.parseLong(st.nextToken());

        if(Square(x2-x1) + Square(y2-y1) >=Square(R1+R2)) System.out.println("NO");
        else System.out.println("YES");
    }
}
