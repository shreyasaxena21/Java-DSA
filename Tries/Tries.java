class TrieNode{
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new TrieNode[26]; // Assuming only lowercase English letters
        isEndOfWord = false;
    }
}
class Trie{
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true; // Mark the end of the word
    }

    public void search(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                System.out.println("Word not found: " + word);
                return;
            }
            current = current.children[index];
        }
        if (current.isEndOfWord) {
            System.out.println("Word found: " + word);
        } else {
            System.out.println("Word not found: " + word);
        }
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                return false; // Prefix not found
            }
            current = current.children[index];
        }
        return true; // Prefix found

    }

    public TrieNode getNode(String str){
        TrieNode current = root;
        for (char c : str.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                return null; // Node not found
            }
            current = current.children[index];
        }
        return current; // Return the node corresponding to the string
    }
}

public class Tries {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hello");   
        trie.insert("world");
        trie.search("hello");
        trie.search("hell");
        System.out.println("Tries class is defined.");
    }
}