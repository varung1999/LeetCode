class Solution {
    public int countDays(int days, int[][] meetings) {
        if(meetings == null || meetings.length == 0) return 0;
        
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        int count = 0;
        count += Math.abs(meetings[0][0] - 1);
        int n = meetings.length;
        for (int i = 1; i < n; i++) {
            if (meetings[i][0] <= meetings[i - 1][1]) {
                if (meetings[i][1] < meetings[i - 1][1]) {
                    meetings[i][1] = meetings[i - 1][1];
                }
            } else {
                int dy = meetings[i][0] - meetings[i - 1][1];
                count += dy - 1;
            }
        }
        count += Math.abs(meetings[n - 1][1] - days);
        return count;
    }
}