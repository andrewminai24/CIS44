package Test;
import java.util.*;


public class Main {
	public static boolean isSame(Stack<String> stack1, Stack<String> stack2) {
		if (stack1.size() != stack2.size()) {
			return false;
		}
		
		else {
			Stack<String> temp1 = new Stack<>();
			Stack<String> temp2 = new Stack<>();
			
			while(!stack1.isEmpty()) {
				temp1.add(stack1.pop());
				temp2.push(stack2.pop());
				
				if(temp1.peek()!=temp2.peek()) {
					while(!temp1.isEmpty()) {
						stack1.push(temp1.pop());
					}
					
					while(!temp2.isEmpty()) {
						stack2.push(temp2.pop());
					}
					
					return false;
				}
			}
			
			while(!temp1.isEmpty()) {
				stack1.push(temp1.pop());
			}
			
			while(!temp2.isEmpty()) {
				stack2.push(temp2.pop());
			}
			
			return true;
		}
	}
	
	public static void main(String[] args) {
			
		Stack<String> stack1 = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		
		stack1.push("Strawberry");
		stack1.push("Pear");
		stack1.push("Orange");
		
		stack2.add("Apple");
		stack2.add("Pear");
		stack2.add("Orange");
		
		
		System.out.println(isSame(stack1,stack2));
		System.out.println(stack1);
		System.out.println(stack2);
	}

}

