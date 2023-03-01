class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length<2) return nums;
        
        mergeSort(nums,nums.length);
        
        return nums;
    }
    
    private void mergeSort(int nums[], int n)
    {
        if(n<2) return;
        
        int mid = n/2;
        int left[] = new int[mid];
        int right[] = new int[n-mid];
        
        for(int i = 0;i<mid;i++)
        {
            left[i]=nums[i];
        }
        
        for(int i=mid;i<n;i++)
        {
            right[i-mid]=nums[i];
        }
        
        mergeSort(left,mid);
        mergeSort(right,n-mid);
        
        merge(nums,left,right);
    }
    
    private void merge(int[] nums,int[] left, int[] right)
    {        
        int i = 0,j=0,k=0;
        
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                nums[k++]=left[i++];
            }
            else{
                nums[k++]=right[j++];
            }
        }
        
        while(i<left.length)
        {
            nums[k++]=left[i++];
        }
        
        while(j<right.length)
        {
            nums[k++]=right[j++];
        }
    }
}