class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp  = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, temp, list);
        
        return list;
    }
    
    public void helper(int[] candidates, int target, int idx, List<Integer> temp, List<List<Integer>> list){
        if(target == 0){
            if(!list.contains(temp)){
                list.add(new ArrayList<Integer>(temp));
            }
            return;
        }
        
        if(target<0){
            return;
        }
        
        if(idx==candidates.length) return;
        
        for(int i=idx; i<candidates.length; i++){
            if(i>idx && candidates[i]==candidates[i-1])
                continue;
            
            if(candidates[i]>target){
                break;
            }
            
            temp.add(candidates[i]);
            helper(candidates,target-candidates[i], i+1, temp, list);
            temp.remove(temp.size()-1);
        }
        
    }
}
