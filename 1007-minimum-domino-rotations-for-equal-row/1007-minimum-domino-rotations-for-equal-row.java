class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        if(tops == null || tops.length ==0) return 0;
        
        int top = findRotations(tops,bottoms,tops[0]);
        if(top!=-1)
        {
            return top;
        }
        
        return findRotations(tops,bottoms,bottoms[0]);
        
    }
    
    private int findRotations(int[] tops, int[] bottoms, int target)
    {
        int topRotations =0,bottomRotations =0;
        
        for(int i=0;i<tops.length;i++)
        {
            if(tops[i]!=target && bottoms[i]!=target)
            {
                return -1;
            }
            
            if(tops[i]!=target)
            {
                topRotations++;
            }
            if(bottoms[i]!=target)
            {
                bottomRotations++;
            }
        }
        
        return Math.min(topRotations,bottomRotations);
    }
}