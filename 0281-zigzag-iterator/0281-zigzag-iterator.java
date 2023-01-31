public class ZigzagIterator {

    Queue<Iterator> q;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        q = new LinkedList<>();
        if(!v1.isEmpty()) q.add(v1.iterator());
        if(!v2.isEmpty()) q.add(v2.iterator());
    }

    public int next() {
        Iterator curr = q.poll();
        int res = (int) curr.next();
        if(curr.hasNext()) q.add(curr);
        return res;
    }

    public boolean hasNext() {
        return q.size()>0;
    }
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */