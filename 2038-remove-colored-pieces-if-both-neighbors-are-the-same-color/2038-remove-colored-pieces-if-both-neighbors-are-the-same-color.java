class Solution {
    public boolean winnerOfGame(String colors) {
        if(colors == null || colors.length() == 0) return false;
        
        int AliceCount = 0;
        int BobCount = 0;
        for(int i = 1;i<colors.length()-1;i++)
        {
            if(colors.charAt(i)=='A' && colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A'){
                AliceCount++;
            }
            else if(colors.charAt(i)=='B' && colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B'){
                BobCount++;
            }
        }
        
        while(true)
        {
            if(AliceCount == 0) return false;
            else if(BobCount == 0) return true;
            
            AliceCount--;
            BobCount--;
        }
        
        
    }
}