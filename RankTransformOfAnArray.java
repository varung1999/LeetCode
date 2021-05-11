package practice;

import java.util.*;

public class Rank {

	public static int[] arrayRankTransform(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int ans[] = arr.clone();
		Arrays.sort(ans);
		for(int i =0;i<ans.length;i++)
		{
			map.putIfAbsent(ans[i],map.size()+1);
		}
		
		for(int i =0;i<arr.length;i++)
		{
			ans[i]=map.get(arr[i]);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {40,10,20,30};// [5,3,4,2,8,6,7,1,3]

		int ans[] = arrayRankTransform(arr);
		for(int i:ans)
		{
			System.out.print(i+" ");
		}
	}

}
