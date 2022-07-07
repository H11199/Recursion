class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new  ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int c = 0;
        
        for(int elem: nums){
            if(!map.containsKey(elem)){
                map.put(elem,1);
            }
            else{
                map.put(elem,map.get(elem)+1);
            }
            
            c++;
        }
        
        Backtrack(list, temp, c, map);
        
        return list;
        
    }
    
    public void Backtrack(List<List<Integer>> list, List<Integer> temp, int c, HashMap<Integer, Integer> map){
        if(c==0){
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for(Map.Entry mapElem: map.entrySet()){
            int k = (int)mapElem.getKey();
            int v = (int)mapElem.getValue();
            
            if(v>0){
                temp.add(k);
                map.put(k,v-1);
                Backtrack(list, temp, c-1, map);
                temp.remove(temp.size()-1);
                map.put(k,v);
            }
        }
        
    }
}
