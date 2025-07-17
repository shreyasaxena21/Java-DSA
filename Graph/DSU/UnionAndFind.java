class UnionAndFind{
    private int [] root; //arrays store the parent of the node

    public UnionAndFind(int size) {
        root = new int[size];
        for(int i = 0 ; i < size; i++){
            root[i] = i; //initially each node is its own parent
        }
    }

    //TC - O(1)
    int find(int x){
        return root[x];
    }
    
    // Disjoint set and union (DSU)
    void union(int x, int y){
        int rootX = find(x); // find the root of x
        int rootY = find(y); // find the root of y

        if(rootX!=rootY){
            for(int i = 0; i < root.length; i++){
                if(root[i] == rootY){ // change the parent of all nodes with rootY to rootX
                    root[i] = rootX;
                }
            }
        }
    }
    
    boolean connected(int x, int y){
        return find(x) == find(y); // check if both nodes have the same root
    }


    public static void main(String[] args) {
        UnionAndFind dsu = new UnionAndFind(10);
        dsu.union(1, 2);
        dsu.union(2, 3);
        dsu.union(4, 5);
        System.out.println(dsu.connected(1, 3)); // true
        System.out.println(dsu.connected(1, 4)); // false
        dsu.union(3, 4);
        System.out.println(dsu.connected(1, 4)); // true

    }
}