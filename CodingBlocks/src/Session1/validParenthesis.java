package Session1;

import java.util.Stack;

public class validParenthesis {
    public boolean isValid(String s) {
        Stack<Character> vis=new Stack<>();
        for (int i=0;i<s.length();i++) {
        	char curC=s.charAt(i);
        	if(curC=='[' || curC=='{' || curC=='(') {
        		vis.push(curC);
        	}
        	else if(curC==']' || curC=='}' || curC==')') {
        		if(vis.isEmpty()) {
        			return false;
        		}
        		char top=vis.pop();
        		if(curC==')' && top=='(') {
        			continue;
        		}
        		if(curC=='}' && top=='{') {
        			continue;
        		}
        		if(curC==']' && top=='[') {
        			continue;
        		}
        		return false;
        	}
        }
        if(!vis.isEmpty()) {
        	return false;
        }
		return true;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
