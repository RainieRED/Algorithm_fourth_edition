package base_01;

import edu.princeton.cs.algs4.Stack;
/**
 * 编写一个过滤器InfixToPostfix，将算术表达式由中序转为后序
 */


public class E_1_3_10 {

	public static void main(String[] args) {
		String input = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
		Stack<String> stack = new Stack<String>(); //结果栈
		Stack<String> stack2 = new Stack<String>(); //运算符栈
		for(String s : input.split(" ")) {
			if(s.equals(")")) {
				String s1=stack.pop();
				String s2=stack.pop();
				stack.push(s2+s1+stack2.pop());
			}else if(s.equals("+") || s.equals("-") || s.equals("*") ) {
				stack2.push(s);
			}else {
				stack.push(s);
			}
		}
		System.out.println(stack.pop());
	}

}
