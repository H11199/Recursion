import java.util.*;

public class GenerateBrackets
{
	public static void main(String[] args) {
		List<String> vector = new ArrayList<>();
		String out = "";
		int inp = 3;
		int close = 3;
		int open = 3;
		GenerateBrackets(vector, close, open, out);
		System.out.println(vector);
	}
	
	public static void GenerateBrackets(List<String> vector, int close, int open, String out){
	    if(open==0 && close==0){
	        vector.add(out);
	        return;
	    }
	    
	    if(open>0){
	        out += "(";
	        GenerateBrackets(vector, close, open-1, out);
	        out = out.substring(0,out.length()-1);
	    }
	    if(close>open){
	        out+=")";
	        GenerateBrackets(vector, close-1, open, out);
	        out = out.substring(0,out.length()-1);
	    }
	}
}
