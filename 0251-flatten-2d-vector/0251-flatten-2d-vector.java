class Vector2D {

    List<Integer> list;
    int index = 0;
    public Vector2D(int[][] vec) {
        list = new ArrayList<>();
        
        for(int[] v : vec)
        {
            for(int num : v)
            {
                list.add(num);
            }
        }
    }
    
    public int next() {
        int num = list.get(index++);
        return num;
    }
    
    public boolean hasNext() {
        return index<list.size();
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D obj = new Vector2D(vec);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */