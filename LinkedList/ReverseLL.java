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

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }   
    ListNode(int val, ListNode next) { this.val = val; this.next = next; } 
}

class Solution {
    public ListNode reverseList(ListNode head) {

        // maintain three pointers

        ListNode prev = null;
        ListNode current  = head;

        while(current.next!=null){
            ListNode nxt = current.next; // store next node
            current.next = prev;
            prev = current;
            current = nxt;
        }

        return prev;
        
    }
}

class ReverseLL{
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode reversedHead = solution.reverseList(head);

        // Print reversed linked list
        ListNode temp = reversedHead;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        
    }
}