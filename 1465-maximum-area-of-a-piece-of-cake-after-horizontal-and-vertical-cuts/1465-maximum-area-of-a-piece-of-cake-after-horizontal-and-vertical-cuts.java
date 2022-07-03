class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        int hlen = horizontalCuts.length;
        int vlen = verticalCuts.length;
        
        int maxH = Math.max(horizontalCuts[0],h - horizontalCuts[hlen-1]);
        int maxV = Math.max(verticalCuts[0],w - verticalCuts[vlen-1]);
        
        for(int i =0;i<hlen - 1;i++)
        {
            maxH = Math.max(maxH, horizontalCuts[i+1] - horizontalCuts[i]);
        }
        
        for(int i =0;i<vlen - 1; i++)
        {
            maxV = Math.max(maxV,verticalCuts[i+1] - verticalCuts[i]);
        }
        
        return (int)((long)maxH*maxV%1000000007);
    }
}