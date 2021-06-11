package arrays;
import java.util.*;

public class MergeIntervals {

	public static int[][] merge(int[][] intervals) {

		Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
		return intervals;
	}

	public static void main(String[] args) {
		int[][] arr= {{2,6},{8,10},{15,18},{1,3}};

		int ans[][] = merge(arr);
		
		for(int i=0;i<ans.length;i++)
		{
			for(int j=0;j<ans[0].length;j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}

	}

}
