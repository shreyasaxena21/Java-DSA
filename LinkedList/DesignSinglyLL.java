class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = next;
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
            temp.next = node;
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

        else{
            Node temp = head;
            for(int i = 0 ;i<index-1; i++){
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }
        size--;
    }
}

class DesignSinglyLL{
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2); // linked list becomes 1->2->3
        System.out.println(linkedList.get(1)); // returns 2
        linkedList.deleteAtIndex(1); // now the linked list is 1->3
        System.out.println(linkedList.get(1)); // returns 3
    }
}