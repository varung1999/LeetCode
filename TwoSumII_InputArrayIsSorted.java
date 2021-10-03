class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] index = new int[2];
        
        int n = numbers.length;
        int left =0,right = n-1;
        
        while(left<=right)
        {
            if(numbers[left]+numbers[right]==target){
                index[0]=left+1;
                index[1]=right+1;
                return index;
            }
            else if(numbers[left]+numbers[right]>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return null;
    }
}
