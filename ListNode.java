public class ListNode {
    int value;
    ListNode next;
    
    ListNode(int x){
        value = x;
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode reversedList(ListNode head){
        ListNode prev = null;

        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static void main(String[] args){
        int[] value = {1,2,3,4,5};
        ListNode head = ListNode.createList(value);
        
        System.out.println("Original List: ");
        ListNode.printList(head);

        ListNode reversedListNode = reversedList(head);

        System.out.println("Reversed List: ");
        ListNode.printList(reversedListNode);
    }
}
