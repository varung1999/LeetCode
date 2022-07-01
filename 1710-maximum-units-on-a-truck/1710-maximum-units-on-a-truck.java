class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        if(boxTypes == null || boxTypes.length == 0) return 0;
        
        Arrays.sort(boxTypes, (a,b)-> b[1] - a[1]);
        
//         for(int i=0;i<boxTypes.length;i++)
//         {
//             for(int j=0;j<boxTypes[0].length;j++)
//             {
//                 System.out.print(boxTypes[i][j]+" ");
//             }
//             System.out.println();
//         }
        
        int temp = truckSize;
        int result = 0;
        
        for(int i =0;i<boxTypes.length;i++)
        {
            int count = boxTypes[i][0];
            int multiply = boxTypes[i][1];
            
            while(temp>0 &&count>0)
            {
                result+=multiply;
                count--;
                temp--;
            }
        }
        
        return result;
    }
}