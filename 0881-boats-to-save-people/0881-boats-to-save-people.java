class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if(people == null || people.length == 0) return 0;
        
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int ans = 0;
        while(i<=j)
        {
            ans++;
            if(people[i]+people[j]<=limit)i++;
            j--;
        }
        return ans;
    }
}