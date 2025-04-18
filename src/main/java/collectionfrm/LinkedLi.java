package collectionfrm;

class SinglyLinkedListNode {
	int data;
	SinglyLinkedListNode next;

	SinglyLinkedListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedLi {

	// Function to compare two linked lists
	public static int compare_lists(SinglyLinkedListNode llist1, SinglyLinkedListNode llist2) {
		// Traverse both lists
		while (llist1 != null && llist2 != null) {
			// If the data does not match
			if (llist1.data != llist2.data) {
				return 0; // The lists are not equal
			}
			// Move to the next nodes in both lists
			llist1 = llist1.next;
			llist2 = llist2.next;
		}

		// If both lists are finished at the same time (same length)
		if (llist1 == null && llist2 == null) {
			return 1; // The lists are equal
		} else {
			return 0; // One list is longer than the other
		}
	}

	public static void main(String[] args) {
		// Example test case 1
		SinglyLinkedListNode list1 = new SinglyLinkedListNode(1);
		list1.next = new SinglyLinkedListNode(2);
		list1.next.next = new SinglyLinkedListNode(3);

		SinglyLinkedListNode list2 = new SinglyLinkedListNode(1);
		list2.next = new SinglyLinkedListNode(2);
		list2.next.next = new SinglyLinkedListNode(3);

		// Check if the lists are equal
		System.out.println(compare_lists(list1, list2)); // Should print 1 (equal)

		// Example test case 2 (lists with different lengths)
		SinglyLinkedListNode list3 = new SinglyLinkedListNode(1);
		list3.next = new SinglyLinkedListNode(2);

		SinglyLinkedListNode list4 = new SinglyLinkedListNode(1);
		list4.next = new SinglyLinkedListNode(2);
		list4.next.next = new SinglyLinkedListNode(3);

		// Check if the lists are equal
		System.out.println(compare_lists(list3, list4)); // Should print 0 (not equal)
	}
}
