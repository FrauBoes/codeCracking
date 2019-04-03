package algorithms;

import java.util.Stack;

public class ParenthesesCheck {
	public static void main(String[] args) {
		String s = "[[";
		System.out.println(isValid(s));
	}
	
	// Use stack to store current open brackets
	// Store opposing bracket in stack and compare with
    public static boolean isValid(String s) {
        
    	// Return false is string is not of even length
        if (s.length() % 2 != 0)
            return false;
        
        // Instantiate stack to keep track of open brackets
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            
            if (c == '(')
            	stack.push(')');
            else if (c == '{') 
            	stack.push('}');
            else if (c == '[')
            	stack.push(']');
            else if (!stack.empty() && stack.peek() == c)
            	stack.pop();
            else
            	return false;
        }
        
        return stack.empty();
    }
}
