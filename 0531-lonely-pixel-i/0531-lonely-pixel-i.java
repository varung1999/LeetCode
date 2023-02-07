class Solution {
    public int findLonelyPixel(char[][] picture) {
        int n = picture.length;
        int m = picture[0].length;
        
        int ans = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                if(picture[i][j] == 'B'){
                    if(checkRow(picture,i,j) && checkCol(picture,i,j)) ans++; 
                }
            }
        }
        
        return ans;
    }
    
    private boolean checkRow(char[][] pic, int r,int c)
    {
        for(int i = 0;i<pic[0].length;i++)
        {
            if(i == c) continue;
            if(pic[r][i] == pic[r][c]) return false;
        }
        return true;
    }
    
    private boolean checkCol(char[][] pic,int r,int c)
    {
        for(int j = 0;j<pic.length;j++)
        {
            if(j==r) continue;
            if(pic[j][c] == pic[r][c]) return false;
        }
        return true;
    }
}