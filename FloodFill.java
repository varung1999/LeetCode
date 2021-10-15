class Solution {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int currentColor = image[sr][sc];
        if(currentColor!=newColor){
		floodFillHelper(image,sr,sc,newColor,currentColor);
        }
        return image;
    }
    
    public static void floodFillHelper(int[][] image, int sr, int sc, int newColor, int currentColor)
    {
        if(sc<0 || sr<0 || sr>= image.length || sc>=image[0].length || image[sr][sc]!=currentColor)
        {
            return;
        }
        
        if(image[sr][sc]==currentColor)
        {
            image[sr][sc]=newColor;
        }
        
        floodFillHelper(image, sr, sc-1, newColor, currentColor);//left
		floodFillHelper(image, sr-1, sc, newColor, currentColor);//top
		floodFillHelper(image, sr, sc+1, newColor, currentColor);//right
		floodFillHelper(image, sr+1, sc, newColor, currentColor);//bottom
        
    }
}
