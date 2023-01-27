class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> visited = new HashSet<>();
        
        while(n!=1 && !visited.contains(n)){
            visited.add(n);
            n = helper(n);
        }
        
        return n == 1;
    }
    
    private int helper(int n)
    {
        int total = 0;
        while(n>0)
        {
            int r = n%10;
            n/=10;
            total += r*r;
        }
        return total;
    }
}