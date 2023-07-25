/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        
        int celeb = 0;
        for(int i = 0;i<n;i++)
        {
            if(knows(celeb,i)) celeb = i;
        }
        
        if(helper(celeb,n)) return celeb;
        
        return -1;
    }
    
    private boolean helper(int i,int n)
    {
        for(int j = 0 ;j<n;j++)
        {
            if(i == j) continue;
            if(knows(i,j) || !knows(j,i)) return false;
        }
        return true;
    }
}