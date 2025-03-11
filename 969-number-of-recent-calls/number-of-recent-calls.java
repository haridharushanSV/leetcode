class RecentCounter {
    Queue<Integer> queue = new LinkedList<>();
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000)
            queue.poll(); // poll removes
        
        return queue.size();
    }
}