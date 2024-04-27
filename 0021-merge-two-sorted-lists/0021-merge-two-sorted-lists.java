import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a new empty list to store the elements
        List<Integer> new_list = new ArrayList<>();

        // Add elements of list1 to new_list
        ListNode current = list1;
        while (current != null) {
            new_list.add(current.val); // Assuming val is the integer value in ListNode
            current = current.next; // Move to the next node
        }

        // Add elements of list2 to new_list
        current = list2;
        while (current != null) {
            new_list.add(current.val); // Assuming val is the integer value in ListNode
            current = current.next; // Move to the next node
        }

        // Sort the new_list
        Collections.sort(new_list);

        // Create a new ListNode to represent the merged list
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (int num : new_list) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next; // Return the head of the merged list
    }
}
