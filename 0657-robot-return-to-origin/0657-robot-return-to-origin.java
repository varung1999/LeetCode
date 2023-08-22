class Solution {
    public boolean judgeCircle(String moves) {
        if(moves == null || moves.length() == 0) return true;
        int x = 0, y = 0;
        for(char c: moves.toCharArray())
        {
            if(c == 'U')
            {
                x+=1;
            }
            else if(c == 'D')
            {
                x-=1;
            }
            else if(c == 'R')
            {
                y+=1;
            }
            else{
                y-=1;
            }
        }
        
        return x == 0 && y == 0;
    }
}