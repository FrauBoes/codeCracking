package advanced;

import java.util.HashMap;

public class TrieNode {
    public HashMap<Character, TrieNode> children = new HashMap<>();

    public int size;
    
    TrieNode() {}
    
    public Boolean isWord() {
        return children.containsKey('*');
    };

}
