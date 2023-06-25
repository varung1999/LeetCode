class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1 == null || nums1.length == 0) return new int[]{};
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] tempResult = new int[n2];
        Arrays.fill(tempResult,-1);
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n2;i++) map.put(nums2[i],i);
        int i = 1;
        while(i<n2)
        {
            while(!stack.isEmpty() && nums2[stack.peek()]<nums2[i])
            {
                int temp = stack.pop();
                tempResult[temp] = nums2[i];                
            }
            
            stack.push(i);
            i++;
        }
        
        System.out.println(stack);
        for(int x: tempResult) System.out.print(x+" ");
        System.out.println(map);
        int[] res = new int[n1];
        
        for(int k = 0;k<n1;k++)
        {
            
            int index = map.get(nums1[k]);
            res[k] = tempResult[index];
            
        }
        
        return res;
    }
}