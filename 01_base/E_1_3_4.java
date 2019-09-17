package base_01;

import edu.princeton.cs.algs4.Stack;
import javafx.scene.Parent;

/**
 * 编写一个Stack的用例Parentheses，从标准输入中读取一个文本流并使用栈判定其中的括号是否配对完整
 * 例如：[()]{}[()()]为true，[(])为false
 * 
 * 思路：
 * 将左括号压入栈中
 * 出现右括号，提取栈顶元素，如果是相对应的，继续；否则返回false
 */
public class E_1_3_4 {
	public static boolean Parentheses(String s) {
		Stack<String> stack = new Stack<String>();
		String leftBrackets= "{[(";
		for(String string:s.split("")) {
			if(leftBrackets.indexOf(string) != -1) {
				stack.push(string);
			}
			else if (string.equals("]")) {
				if(!stack.pop().equals("["))
					return false;
			} 
			else if (string.equals("}")) {
				if(!stack.pop().equals("{")) 
					return false;
			} 
			else if (string.equals(")")) {
				if(!stack.pop().equals("("))
					return false;
			} 
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "[[()])]";
		System.out.println(Parentheses(s));
	}

}
