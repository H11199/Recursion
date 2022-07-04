import java.util.*;
class Solution {
    static String[] codes = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String s) {
            
        List<String> list = new ArrayList<>();
        
        if(s.equals("")) return list;
		
		letterCombinationsHelper(s,new StringBuilder(), list, s.length(), 0);
        
        return list;
    }
    public void letterCombinationsHelper(String input, StringBuilder s, List<String> list, int n, int idx){
	    if(idx==n){
	        list.add(s.toString());
	        return;
	    }
	    
	    String codedStr = codes[Integer.parseInt(input.charAt(idx)+"")];
	    
	    for(int i=0; i<codedStr.length(); i++){
	        s.append(codedStr.charAt(i));
	        letterCombinationsHelper(input, s, list, n, idx+1);
	        s.deleteCharAt(s.length()-1);
	    }
	}
    
}
