package Basic;

import java.util.Scanner;
import java.util.Stack;

public class BOJ9012 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for(int i =0 ; i<N ;i++){
            String str = sc.nextLine();
            for(int j=0; j<str.length();j++){
                if(str.charAt(j) == '(') stack.push(str.charAt(j));
                else {
                    if(!stack.isEmpty() && stack.peek()=='('){
                        stack.pop();
                    }else {
                        stack.push(str.charAt(j));
                        break;
                    }
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES");
            }else System.out.println("NO");

            stack.clear();
        }
    }
}
