package Basic;
public class BOJ4673 {
    static boolean[] check = new boolean[10001];
    public static void main(String[] args) {
        // 모든 수에 대해 생성자를 체크
        for (int i = 1; i <= 10000; i++) {
            d(i);
        }
        for(int i =1; i<=10000;i++){
            //false일 때 출력하도록 설정
            if(!check[i]) System.out.println(i);
        }
    }
    //생성자 체크 함수
    static void d(int num){
        int nextNum = num + sumDigits(num);
        if(nextNum<=10000){
            check[nextNum] = true;
            d(nextNum);
        }
    }
    static int sumDigits(int num){
        int sum = 0;
        while (num!=0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
}
