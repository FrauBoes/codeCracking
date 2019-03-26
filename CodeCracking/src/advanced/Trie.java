package advanced;

import java.util.Scanner;
import advanced.TrieNode;

public class Trie {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Trie t = new Trie();

        for (int i = 0; i < n; i++) {
            String[] opContact = scanner.nextLine().split(" ");
            String op = opContact[0];
            String contact = opContact[1];
   
            if (op.equals("add")) {
                t.add(contact);
            } else if (op.equals("find")) {
                System.out.println(t.find(contact));
            }
        }
        
        scanner.close();
    }
	
	
    public TrieNode root = new TrieNode();

    // default constructor
    Trie() {}

    // add string to trie
    public void add(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (! current.children.containsKey(currentChar)) {
                current.children.put(currentChar, new TrieNode());
            }
            
            current = current.children.get(currentChar);
            current.size++;
            
        }
        current.children.put('*', new TrieNode());
    }

    // count number of strings in trie that have word as prefix
    public int find(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
        	char ch = word.charAt(i);
        	current = current.children.get(ch);
        	
        	if (current == null)
        		return 0;
        }

        return current.size;
    }
}


