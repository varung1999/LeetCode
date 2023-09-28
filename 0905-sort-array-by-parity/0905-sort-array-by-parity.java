class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
        
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for(int i:nums){
            if(i%2==0) even.add(i);
            else odd.add(i);
        }
        
        int[] res = new int[nums.length];
        int i = 0;
        for(int j = 0;j<even.size();j++) res[i++] = even.get(j);
        for(int j = 0;j<odd.size();j++) res[i++] = odd.get(j);
        
        return res;
    }
}