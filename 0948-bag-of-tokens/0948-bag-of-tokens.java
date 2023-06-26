class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens == null || tokens.length == 0) return 0;
        
        Arrays.sort(tokens);
        int left = 0, right = tokens.length - 1;
        int score = 0;
        int ans = 0;
        while(left<=right && (tokens[left]<=power || score > 0))
        {
            while(left<=right && power>= tokens[left])
            {
                power -= tokens[left];
                left++;
                score++;
            }
            ans = Math.max(ans,score);
            
            if(left<=right)
            {
                power+=tokens[right--];
                score--;
            }
        }
        
        return ans;
        
    }
}