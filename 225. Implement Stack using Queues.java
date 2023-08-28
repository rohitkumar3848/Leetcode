class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        q1.add(x);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
    }
    
    public int pop() {
        int val=q1.peek();
        q1.poll();
        return val;
    }
    
    public int top() {
        return q1.peek();
        
    }
    
    public boolean empty() {
        return q1.isEmpty();
        
    }
}
