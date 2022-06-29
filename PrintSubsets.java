public class PrintSubsets
{
	public static void main(String[] args) {
		String output = "";
		String input = "abcd";
		printSubsets(input, output);
	}
	public static void printSubsets(String input, String output){
	    if(input.length() == 0){
	        System.out.println(output);
	        return;
	    }
	    
	    String out1 = output;
	    String out2 = output;
	    
	    out1 += input.charAt(0);
	    input = input.substring(1);
	    
	    printSubsets(input,output);
	    printSubsets(input, out1);
	}
}
