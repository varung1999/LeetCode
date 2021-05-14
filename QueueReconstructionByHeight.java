class Solution {
    public  int[][] reconstructQueue(int[][] people) {

		Arrays.sort(people,new peopleComparator());
		
		
		ArrayList<int[]> list = new ArrayList<>();
		
		for(int[] i: people)
		{
			list.add(i[1], i);
		}

		return list.toArray(new int[people.length][2]);
		
	}
    
    public class peopleComparator implements Comparator<int[]>{
        public int compare(int[] one,int[] two){
            if(one[0]==two[0]) return one[1]-two[1];
            return two[0]-one[0];
        }
    }
}
