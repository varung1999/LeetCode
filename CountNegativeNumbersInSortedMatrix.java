//Link to the full explanation : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/discuss/1910161/Java-Binary-Search-Solution

class Solution {
    public int countNegatives(int[][] grid) {
        
        int count = 0;        
        int n = grid.length;
        
        for(int i =0;i<n;i++)
        {
            int first = BinarySearchFirst(grid[i]);
            int last = BinarySearchSecond(grid[i]);
            
            if(first!=-1 && last!=-1)
            {
                count+=(last-first)+1;
            }
        }
        return count;
    }
    
    private int BinarySearchFirst(int[] grid)
    {
        int low = 0,high = grid.length-1;
        
        int index = -1;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            
            if(grid[mid]<0)
            {
                index = mid;
                high = mid -1;
            }
            else
            {
                low = mid + 1;
            }
        }
        
        return index;
    }
    
    private int BinarySearchSecond(int[] grid)
    {
        int low = 0,high = grid.length -1;
        
        int index = -1;
        
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            
            if(grid[mid]<0)
            {
                index = mid;
                low = mid + 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        
        return index;
    }
}
