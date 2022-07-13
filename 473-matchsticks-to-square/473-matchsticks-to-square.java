class Solution {
    public boolean makesquare(int[] matchsticks) {
        if(matchsticks.length<4) return false;
        
        int sum =0;
        for(int i: matchsticks)
        {
            sum+=i;
        }
        
        if(sum%4!=0) return false;
        int side = sum /4;
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        return helper(matchsticks,side, 0, new int[4]);
        
    }
    
    private boolean helper(int[] matchsticks, int side, int index, int[] square)
    {
        //base
        if(index == matchsticks.length)
        {
            if(square[0] == side && square[1] == side && square[2] == side && square[3] == side) {
                return true;
            }
            return false;
        }
        
        //logic
        for(int i =0;i<4;i++)
        {
            if(matchsticks[index] + square[i] <= side)
            {
                //action
                square[i] = square[i] + matchsticks[index];
                
                //recurse
                if(helper(matchsticks,side,index + 1, square))
                {
                    return true;
                }
                
                //backtrack
                square[i]=square[i] - matchsticks[index];
            }
        }
        
        return false;
    }
    
    private void reverse(int[] match)
    { 
        int left =0, right = match.length -1;
        
        while(left<=right)
        {
            int temp = match[left];
            match[left]= match[right];
            match[right]= temp;
            left++;
            right--;
        }
    }
}