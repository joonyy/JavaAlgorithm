package Basic;

import java.util.Scanner;
import java.util.Stack;

public class BOJ10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<N;i++){
            String command = sc.next();
            if(command.equals("push")){
                int x = sc.nextInt();
                stack.push(x);
            }if(command.equals("pop")){
                if(stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.pop());
            }if(command.equals("size")){
                System.out.println(stack.size());
            }if(command.equals("empty")){
                if(stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }if(command.equals("top")){
                if(!stack.isEmpty()) System.out.println(stack.get(stack.size()-1));
                else System.out.println(-1);
            }
        }
    }

}
