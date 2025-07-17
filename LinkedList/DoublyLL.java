class Node{
    int val;
    Node next;
    Node prev;

    Node(int val){
        this.val = val;
        
    }
}

class MyLinkedList {
    Node head;
    int size;

    public MyLinkedList() {
      size = 0;
    }
    // get O(N)
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        
        else{
            Node temp = head;
            for(int i = 0; i<index-1;i++){
                temp = temp.next;
            }

            return temp.val;
        }
    }
    
    public void addAtHead(int val) {
        //create node
        Node node = new Node(val);

        // if head is null, LL is empty
        if(head == null){
            head = node;
        }

        else{
            node.next = head;
            head.prev = node; // set previous pointer of current head
            head = node;   
        }

        size++;
    }
    // TC O(1)
    public void addAtTail(int val) {
        Node node = new Node(val);

        // if LL is empty
        if(head==null){
            head = node;
        }

        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = node;
            node.prev = temp; 
        }

        size++;
       
    }
    
    // TC O(N)
    public void addAtIndex(int index, int val) {
        Node node = new Node(val);

        if(index<0 || index>size){
            return;
        }
        // if node is at index 0 , add at head
        if(index==0){
            addAtHead(val);
        }

        else if(index==size){
            addAtTail(val);
        }

        else{
            Node temp = head;
            for(int i = 0 ; i<index-1;i++){
                temp = temp.next;

            }

            node.next = temp.next;
            temp.next.prev = node;
            temp.next = node;
            node.prev = temp; // set previous pointer of new node
            size++;
        }
    }
    
    // TC O(N)
    public void deleteAtIndex(int index) {
        if(index<0 || index>size){
            return;
        }

        if(index==0){
            head = head.next;
        }

        else if(index==size-1){
            //last node
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.prev.next = null; // remove last node
        }

        else{
            Node temp = head;
            for(int i = 0 ;i<index; i++){
                temp = temp.next;
            }

            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        size--;
    }
}



class DoublyLL{
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtIndex(1, 3); // linked list becomes 1->3->2
        myLinkedList.deleteAtIndex(1); // now the linked list is 1->2
        System.out.println(myLinkedList.get(1)); // returns 2       
        myLinkedList.addAtTail(4);
        myLinkedList.addAtHead(0); // linked list becomes 0->1->
        myLinkedList.addAtIndex(2, 5); // linked list becomes 0->1->5->2->4
        System.out.println(myLinkedList.get(2)); // returns 5
        myLinkedList.deleteAtIndex(0); // now the linked list is 1->5->2->4
        System.out.println(myLinkedList.get(0)); // returns 1

        myLinkedList.deleteAtIndex(3); // index out of bounds, no change
        System.out.println(myLinkedList.get(3)); // returns -1
    }
}
