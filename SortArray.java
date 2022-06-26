import java.util.*;
public class SortArray
{
	public static void main(String[] args) {
	    
	    List<Integer> arr = new ArrayList(Arrays.asList(5,1,0,2));
		
		System.out.println(sort(arr));
		
	}
	
	public static List<Integer> sort(List<Integer> arr){
	    if(arr.size()==1){
	        return arr;
	    }
	    
	    int last_item = arr.get(arr.size()-1);
	    
	    arr.remove(arr.size()-1);
	    
	    arr = sort(arr);
	    
	    arr = insert(arr, last_item);
	    
	    return arr;
	}
	
	public static List<Integer> insert(List<Integer> arr, int last_item){
	    if(arr.size()==0 || last_item >= arr.get(arr.size()-1)){
	        arr.add(last_item);
	        return arr;
	    }
	    
	    int val = arr.get(arr.size()-1);
	    arr.remove(arr.size()-1);
	    
	    arr = insert(arr, last_item);
	    
	    arr.add(val);
	    
	    return arr;
	}
	
}
