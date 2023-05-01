class Solution {
    public double average(int[] salary) {
        if(salary == null || salary.length == 0) return 0;

        Arrays.sort(salary);
        double count = 0,sum = 0;
        for(int i = 1;i<salary.length - 1;i++)
        {
            sum+= salary[i];
            count++;
        }
        
        return sum/count;
    }
}