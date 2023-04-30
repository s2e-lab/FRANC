import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID162{
	/**
	* 括号匹配检测.
	*/
	public boolean checkbracket(String str){
			Stack<Character> stack = new Stack<>(); // 创建一个栈用于存储左括号
		char[] s = str.toCharArray(); // 将输入的字符串转化为字符数组
		for (char c : s) {
			if (c == '(' || c == '[' || c == '{') { // 如果是左括号，则放入栈中
				stack.push(c);
			} else if (c == ')' || c == ']' || c == '}') { // 如果是右括号
				if (stack.isEmpty()) { // 如果栈为空，则表示左括号不足，匹配失败
					return false;
				}
				char left = stack.pop(); // 从栈中弹出一个左括号
				if ((c == ')' && left != '(') || (c == ']' && left != '[') || (c == '}' && left != '{')) { // 判断右括号和弹出的左括号是否匹配
					return false;
				}
			}
		}
		return stack.isEmpty(); // 遍历完所有字符后，如果栈为空则表示匹配成功，否则表示左括号不足导致匹配失败
	}
	/**
	* 主函数.
	*/
	public static void main(String[] args){
		ID162 test = new ID162();
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String str = cin.nextLine();
			System.out.println(test.checkbracket(str));
		}
	}
}