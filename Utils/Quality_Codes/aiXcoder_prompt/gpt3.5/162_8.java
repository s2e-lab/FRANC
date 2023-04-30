import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID162{
	/**
	* 括号匹配检测.
	*/
	public boolean checkbracket(String str){
			Stack<Character> stack = new Stack<Character>(); // 创建一个栈存放左括号
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(c == '(' || c == '[' || c == '{'){ // 如果当前字符是左括号，就进栈
				stack.push(c);
			} else if(c == ')' || c == ']' || c == '}'){ // 如果当前字符是右括号，就检查栈顶元素是否与其匹配
				if(stack.isEmpty()){ // 如果栈为空，说明当前右括号没有匹配的左括号，返回 false
					return false;
				}
				char top = stack.peek();
				if((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')){ // 如果匹配成功，就将栈顶元素弹出
					stack.pop();
				} else { // 如果匹配失败，说明括号不匹配，返回 false
					return false;
				}
			}
		}
		if(!stack.isEmpty()){ // 如果栈中还有左括号未匹配，说明括号不匹配，返回 false
			return false;
		}
		return true; // 如果所有括号都匹配成功，返回 true
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine(); // 读取输入的字符串
		ID162 obj=new ID162(); // 创建对象
		boolean result=obj.checkbracket(str); // 调用 checkbracket 方法
		if(result){ // 如果所有括号都匹配成功
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}