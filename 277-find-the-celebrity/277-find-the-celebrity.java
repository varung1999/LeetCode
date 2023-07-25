/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        if(n == 0) return -1;
        
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(i == j) continue;
                
                if(knows(j,i)){
                    arr[i]++;
                    arr[j]--;
                }
            }
        }
        
        for(int i = 0;i<n;i++){
            if(arr[i] == n-1) return i;
        }
        
        return -1;
        
    }
}