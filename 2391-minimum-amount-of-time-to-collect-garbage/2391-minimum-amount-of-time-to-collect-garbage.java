class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int paper = 0,metal = 0,glass = 0;
        int total = 0;
        for(int i =0;i<garbage.length;i++)
        {
            String p = garbage[i];
            for(char ch : p.toCharArray())
            {
                if(ch=='P') paper = i;
                else if(ch == 'M') metal = i;
                else if(ch == 'G') glass = i;
                total ++ ;
            }
        }
        
        for(int i=1;i<travel.length;i++)
        {
            travel[i]+=travel[i-1];
        }
        
        if(paper!=0) total+=travel[paper-1];
        if(metal!=0) total+=travel[metal-1];
        if(glass!=0) total+=travel[glass-1];
        
        return total;
    }
}