class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        if(num == null || num.length == 0) return new ArrayList<>();
        
        int n = num.length;
        List<Integer> result = new ArrayList<>();
        int i = num.length;
        while(--i >=0 || k> 0)
        {
            if(i>=0) k+=num[i];
            result.add(k%10);
            k=k/10;
        }
        
        Collections.reverse(result);
        return result;
    }
}