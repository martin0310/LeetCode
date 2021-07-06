class MyQueue {
    
    Queue<Integer> queue;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        queue = new LinkedList<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        queue.add(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return queue.remove();
    }
    
    /** Get the front element. */
    public int peek() {
        for(Integer number : queue){
            return number;
        }
        
        return 0;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
