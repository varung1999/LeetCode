class MyHashMap {

    class Node{
        int key,value;
        Node next;
        
        public Node(int key, int value)
        {
            this.key = key;
            this.value = value;
        }
    }
        int buckets; 
        Node[] node;
    
    public MyHashMap() {
        buckets = 10000;
        node = new Node[buckets];
    }
    
    private Node find(Node head, int key)
    {
        Node prev = head;
        Node curr = head.next;
        
        while(curr!=null && curr.key!=key)
        {
            prev = curr;
            curr = curr.next;
        }
        
        return prev;
    }
    
    private int getHash(int key)
    {
        return key%buckets;
    }
    
    public void put(int key, int value) {
        int index = getHash(key);
        if(node[index]==null)
        {
            node[index] = new Node(-1,-1);
        }
        Node prev = find(node[index],key);
        if(prev.next == null)
        {
            prev.next = new Node(key,value);
        }
        else{
            prev.next.value =value;
        }
    }
    
    public int get(int key) {
        int index = getHash(key);
        if(node[index]==null) return -1;
        
        Node prev = find(node[index],key);
        if(prev.next == null) return -1;
        return prev.next.value;
    }
    
    public void remove(int key) {
        int index = getHash(key);
        if(node[index]==null) return;
        
        Node prev = find(node[index],key);
        if(prev.next == null) return;
        prev.next = prev.next.next;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */