package practice;

import java.util.*;

public class QueueReconstructionbyHeight {

	public  int[][] reconstructQueue(int[][] people) {

		Arrays.sort(people,new peopleComparator());
		
		
		ArrayList<int[]> list = new ArrayList<>();
		
		for(int[] i: people)
		{
			list.add(i[1], i);
		}

		return list.toArray(new int[people.length][2]);
		
	}
	
	public class peopleComparator implements Comparator<int[]> {
		public int compare(int[] one,int[] two)
		{
			if(one[0]==two[0])
			{
				return one[1]-two[1];
			}
			return two[0]-one[0];
		}
	}

	public static void main(String[] args) {
		int arr[][] = {{9,0},{7,0},{1,9},{3,0},{2,7},{5,3},{6,0},{3,4},{6,2},{5,2}};
		
		QueueReconstructionbyHeight q = new QueueReconstructionbyHeight();
		int ans[][] =q.reconstructQueue(arr);
		
				for(int i=0;i<ans.length;i++)
				{
					for(int j = 0;j<ans[0].length;j++)
					{
						System.out.print(ans[i][j]+" ");
						
					}
					System.out.println();
				}
	}

}
