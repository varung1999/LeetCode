class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> temp = new ArrayList<>();
        
        for(int i =0;i<=rowIndex;i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j =0;j<i+1;j++)
            {
                if(j==0 || j == i)
                {
                    row.add(1);
                }
                else{
                    row.add(temp.get(i-1).get(j-1)+temp.get(i-1).get(j));
                }
            }
            temp.add(row);
        }
        
        return temp.get(rowIndex);
        
    }
}