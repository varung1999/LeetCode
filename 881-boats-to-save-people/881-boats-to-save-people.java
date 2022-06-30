class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if(people == null || people.length == 0) return 0;
        
        Arrays.sort(people);// 1 2 2 3
        
        int count = 0;
        int i =0;
        int j = people.length - 1;
        
        while(i<=j)
        {
            count++;
            if(people[i]+people[j]<=limit)
            {
                i++;
            }
            j--;
        }
        
        return count;
    }
}