import java.util.*;
public class SortStack
{
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(1);
		stack.push(0);
		stack.push(2);
		
		System.out.println(sortStack(stack));
	}
	
	public static Stack<Integer> sortStack(Stack<Integer> stack){
	    if(stack.size()==1)return stack;
	    
	    int last_item = stack.pop();
	    
	    stack = sortStack(stack);
	    stack = insert(stack, last_item);
	    
	    return stack;
	}
	
	public static Stack<Integer> insert(Stack<Integer> stack, int last_item){
	    if(stack.size()==0 || last_item >= stack.peek()){
	        stack.push(last_item);
	        return stack;
	    }
	    
	    int val = stack.pop();
	    
	    stack = insert(stack, last_item);
	    
	    stack.push(val);
	    
	    return stack;
	    
	}
	
}
