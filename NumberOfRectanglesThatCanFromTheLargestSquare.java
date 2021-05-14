package practice;

public class NoOfRectangles {

	public static int countGoodRectangles(int[][] rectangles) {
		int len[] = new int[rectangles.length];
		int k=0;
		int a = Integer.MAX_VALUE;
		
		for(int i =0;i<rectangles.length;i++)
		{
				len[k]=Math.min(rectangles[i][0], rectangles[i][1]);
				k++;
		}
		
		int max =0;
		for(int i: len)
		{
			if(i>max)
			{
				max = i;
			}
		}
		
		int count = 0;
		for(int i: len)
		{
			if(i==max)
			{
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		int rectangles[][] = {{2,3},{3,7},{4,3},{3,7}};
		int ans = countGoodRectangles(rectangles);
		System.out.println(ans);
		
		

	}

}
