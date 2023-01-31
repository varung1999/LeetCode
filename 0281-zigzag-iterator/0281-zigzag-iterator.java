public class ZigzagIterator {

    List<Integer> list;
    int curr = 0;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        list = new ArrayList<>();
        int idx1 = 0, idx2 = 0, n = v1.size(), m = v2.size();
        
        while(idx1<n && idx2<m)
        {
            list.add(v1.get(idx1++));
            list.add(v2.get(idx2++));
        }
        
        while(idx1<n)
        {
            list.add(v1.get(idx1++));
        }
        
        while(idx2<m)
        {
            list.add(v2.get(idx2++));
        }
    }

    public int next() {
        int x = list.get(curr++);
        return x;
    }

    public boolean hasNext() {
        return curr<list.size();
    }
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */