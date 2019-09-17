package base_01;

import edu.princeton.cs.algs4.Stack;
/**
 * 从标准输入得到一个缺少左括号的表达式并打印出补全括号之后的中序表达式
 */
public class E_1_3_9 {

	public static void main(String[] args) {
		String input = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
		Stack<String> stack = new Stack<String>(); //结果栈
		Stack<String> stack2 = new Stack<String>(); //运算符栈
		for(String s :input.split(" ")) {
			String string="";
			if(s.equals("+") || s.equals("-") || s.equals("*")) {
				stack2.push(s);
			}else if (s.equals(")")) {
				String s1=stack.pop();
				String s2=stack.pop();
				string ="( " + s2 +" "+stack2.pop()+" "+ s1 +" )";
				stack.push(string);
			}else {
				stack.push(s);
			}
		}
		System.out.println(stack.pop());
	}

}
	
