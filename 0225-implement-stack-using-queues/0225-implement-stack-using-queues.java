class MyStack {
    
    Queue<Integer> q1;
    Queue<Integer> q2;
    
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();    
    }
    
    public void push(int x) {
        q1.add(x);
        
    }
    
    public int pop() {
        
        int size = q1.size();
        for(int i = 0;i<size-1;i++) q2.add(q1.poll());
        
        int x = q1.poll();
        while(!q2.isEmpty()) q1.add(q2.poll());
        return x;
    }
    
    public int top() {
        int x = pop();
        q1.add(x);
        return x;
        
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */