class Solution {
    public int arraySign(int[] nums) {
        double prod = 1;
        for(int num:nums) prod*=num;
        System.out.println(prod);
        if(prod>0) return 1;
        else if(prod<0) return -1;
        else return 0;
    }
}