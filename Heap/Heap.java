class Heap{
    int [] heap;
    int size;

    Heap(int capacity){
        heap = new int[capacity];
        size = 0; // initially the heap is empty

    }

    //insert
    void insert(int value){
        if(size == heap.length){
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = value; // add the new value at the end
        size++;
        heapifyUp(size - 1); // restore the heap property
    }

    // heapify
    private void heapifyUp(int index){
        int parentIndex = (index - 1) / 2;
        while(index > 0 && heap[index] > heap[parentIndex]){
            // swap
            int temp = heap[index];
            heap[index] = heap[parentIndex];
            heap[parentIndex] = temp;

            index = parentIndex; // move up the tree
            parentIndex = (index - 1) / 2; // update parent index
        }
    }

    //swap
    private void swap(int index1, int index2){
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    //GETMIN    
    int getMax(){
        if(size == 0){
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0]; // the root is the maximum element
    }
}

class main{
    public static void main(String[] args){
        System.out.println("Heap class is defined.");
        Heap heap = new Heap(10);
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);
        System.out.println("Max element in heap: " + heap.getMax());
    }
}