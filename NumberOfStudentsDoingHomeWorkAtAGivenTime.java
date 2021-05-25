package practice;

public class HomeWork {

 //Time Complexity: O(n) 
	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int n = startTime.length;
		int m = endTime.length;
		int count = 0;
		for(int i =0;i<n;i++)
		{
			for(int j = i;j<i+1;j++)
			{
				if(startTime[i]<=queryTime && queryTime<=endTime[j])
				{
					System.out.println(startTime[i] +" "+ endTime[j]);
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] startTime = {9,8,7,6,5,4,3,2,1};
		int[] endTime = {10,10,10,10,10,10,10,10,10};
		int QueryTime = 5;
		
		int ans = busyStudent(startTime, endTime, QueryTime);
		System.out.println(ans);


	}

}
