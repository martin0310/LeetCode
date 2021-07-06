/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        HashMap<Integer,Integer> map = new HashMap();
        List<Integer> list = new ArrayList<>();
        while(head != null){
            if(map.containsKey(head.val))
                map.replace(head.val,map.get(head.val) + 1);
            else
                map.put(head.val,1);
            
            head = head.next;
        }
        
        
        for(Map.Entry temp : map.entrySet()){
            if((int)temp.getValue() == 1)
                list.add((Integer)temp.getKey());
        }
        if(list.size() == 0) return null;
        Collections.sort(list);
        ListNode result = new ListNode(list.get(0));
        ListNode current = result;
        int index = 1;
        while(index < list.size()){
            //current.val = list.get(index);
            //current.next = new ListNode(0);
            //current = current.next;
            current.next = new ListNode(list.get(index));
            current = current.next;
            index++;
        }
        
        return result;
    }
}
