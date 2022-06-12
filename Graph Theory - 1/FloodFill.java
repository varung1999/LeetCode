class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        if(image[sr][sc] == newColor)
        {
            return image;
        }
        
        helper(image,sr,sc,newColor,image[sr][sc]);
        
        return image;
    }
    
    private void helper(int[][] image, int sr,int sc, int newColor, int currColor)
    {
        //base
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=currColor)
        {
            return;
        }
        
        //logic
        
        if(image[sr][sc] == currColor)
        {
            image[sr][sc] = newColor;
        }
        
        helper(image,sr-1,sc,newColor,currColor);//up
        helper(image,sr+1,sc,newColor,currColor);//down
        helper(image,sr,sc-1,newColor,currColor);//left
        helper(image,sr,sc+1,newColor,currColor);//right
    }
}
