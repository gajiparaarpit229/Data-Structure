class CircularLinkedListDemo {

    // Node class representing each element in the circular linked list
    class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    // First and last pointers for the circular linked list
    Node first = null;
    Node last = null;

    // Insert a new node at the beginning of the list
    public void insertAtFirst(int info) {
        Node newNode = new Node(info);

        if (first == null) { // If the list is empty
            newNode.link = newNode;
            first = last = newNode;
            return;
        }

        newNode.link = first;
        first = last.link = newNode;
    }

    // Insert a new node at the end of the list
    public void insertAtLast(int info) {
        Node newNode = new Node(info);

        if (first == null) { // If the list is empty
            newNode.link = newNode;
            first = last = newNode;
            return;
        }

        newNode.link = first;
        last.link = newNode;
        last = newNode;
    }

    // Insert a new node in sorted order
    public void insertInOrder(int info) {
        Node newNode = new Node(info);

        if (first == null) { // If the list is empty
            newNode.link = newNode;
            first = last = newNode;
            return;
        }

        if (newNode.info <= first.info) { // Insert at the beginning
            newNode.link = first;
            first = last.link = newNode;
            return;
        }

        Node save = first;
        while (save != last && newNode.info >= save.link.info) {
            save = save.link;
        }

        newNode.link = save.link;
        save.link = newNode;

        if (save == last) {
            last = newNode;
        }
    }

    // Display the linked list
    public void displayLinkedList() {
        if (first == null) {
            System.out.println("Linked List Is Empty");
            return;
        }

        Node save = first;
        while (save != last) {
            System.out.print(save.info + " -> ");
            save = save.link;
        }

        System.out.print(save.info);
        System.out.println();
    }

    // Delete a node with the given info
    public void deleteNode(int info) {
        if (first == null) {
            System.out.println("Linked List Is Empty");
            return;
        }

        if (first == last && first.info == info) {
            first = last = null;
            return;
        }

        if (info == first.info) {
            first = last.link = first.link;
            return;
        }

        Node save = first;
        Node prev = first;
        while (save != last && save.info != info) {
            prev = save;
            save = save.link;
        }

        if (save.info != info) {
            System.out.println("Node Not Found");
            return;
        }

        prev.link = save.link;
        if (save == last) {
            last = prev;
        }
    }

    // Count the number of nodes in the list
    public int countNode() {
        if (first == null) {
            return 0;
        }

        Node save = first;
        int count = 0;
        while (save != last) {
            count++;
            save = save.link;
        }

        return count + 1;
    }

    // Split the circular linked list into two halves
    public CircularLinkedListDemo splitIntoTwoHalves() {
        CircularLinkedListDemo l2 = new CircularLinkedListDemo();
        int mid = Math.ceilDiv(this.countNode(), 2);

        Node save = first;
        for (int i = 1; i < mid; i++) {
            save = save.link;
        }

        l2.first = save.link;
        l2.last = last;
        l2.last.link = l2.first;

        save.link = first;
        last = save;

        return l2;
    }
}