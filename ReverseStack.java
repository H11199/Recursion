import java.util.*;
public class ReverseStack
{
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		System.out.println(reverseStack(stack));
	}
	public static Stack<Integer> reverseStack(Stack<Integer> stack){
	    if(stack.size() == 1){
	        return stack;
	    }
	    
	    int top_element = stack.pop();
	    
	    stack = reverseStack(stack);
	    
	    stack = insert(stack, top_element);
	    
	    return stack;
	}
	
	public static Stack<Integer> insert(Stack<Integer> stack, int num){
	    if(stack.size()==0){
	        stack.push(num);
	        return stack;
	    }
	    
	    int top_element = stack.pop();
	    stack = insert(stack, num);
	    
	    stack.push(top_element);
	    return stack;
	}
}
