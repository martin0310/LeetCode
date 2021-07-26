class LRUCache {
    
    HashMap<Integer,Integer> map;
    HashMap<Integer,DoublyLinkedList.ListNode> node_map;
    
    private int capacity;
    private DoublyLinkedList dll;
    
    class DoublyLinkedList{
        
        private ListNode head;
        private ListNode tail;
        private int length;
        
        private class ListNode{
            
            private int data;
            private ListNode next;
            private ListNode previous;
            
            public ListNode(int data){
                this.data = data;
            }
        }
        
        public DoublyLinkedList(){
            this.head = null;
            this.tail = null;
            this.length = 0;
        }
        
        public boolean isEmpty() {
		    return length == 0; // or head == null
	    }
        
        public void insertFirst(int key,int value){
            if(length  < capacity){
                ListNode newNode = new ListNode(key);
                map.put(newNode.data,value);
                node_map.put(newNode.data,newNode);
                /////////////////////////////////////
                if(isEmpty()) {
                    tail = newNode;
                } else {
                    head.previous = newNode;
                }
                newNode.next = head;
                head = newNode;
                length++;
            }else{
                ListNode newNode = new ListNode(key);
                map.put(newNode.data,value);
                node_map.put(newNode.data,newNode);
                //////////////////////////////////////
                map.remove(tail.data);
                node_map.remove(tail.data);
                
                head.previous = newNode;
                newNode.next = head;
                head = newNode;
                
                ListNode temp;
                temp = tail;
                
                tail.previous.next = null;
                temp = tail.previous;
                tail.previous = null;
                tail = temp;
                temp = null;
                
                //tail = tail.previous;
                
                
            }
        }
        
        /*public void get_moveToFront(int key){
            
        }*/
        
        public void moveToFront(int key){
            ListNode temp = node_map.get(key);
            if(head == temp) return ;
            if(head == tail) return ;
            
            temp.previous.next = temp.next;
            if(temp.next == null){
                tail = temp.previous;
                //temp.previous.next = null;
                temp.next = head;
                head.previous = temp;
                temp.previous = null;
                head = temp;
                head.previous = null;
                //temp = null;
            }
            else{
                //temp.next.previous.previous = temp.previous;
                temp.previous.next.previous = temp.previous.next.previous.previous;
                temp.previous = null;
                head.previous = temp;
                temp.next = head;
                head = temp;
            }
        }
    }
    
    public LRUCache(int capacity) {
        map = new HashMap<Integer,Integer>();
        node_map = new HashMap<Integer,DoublyLinkedList.ListNode>();
        this.capacity = capacity;
        dll = new DoublyLinkedList();
        this.capacity = capacity;
        
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            dll.moveToFront(key);
            return map.get(key);
        }
        
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.replace(key,value);
            dll.moveToFront(key);
        }else{
            dll.insertFirst(key,value);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
