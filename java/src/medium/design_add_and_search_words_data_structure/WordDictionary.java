package medium.design_add_and_search_words_data_structure;

import medium.implement_trie.TrieNode;

public class WordDictionary {
    private TrieNode root;

    public WordDictionary(){
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        return searchInNode(word, root, 0);
    }

    private boolean searchInNode(String word, TrieNode node, int start) {
        if (node == null) {
            return false;
        }

        if (start == word.length()) {
            return node.isEndOfWord;
        }

        char c = word.charAt(start);
        if (c == '.') {
            for (TrieNode child : node.children) {
                if (child != null && searchInNode(word, child, start + 1)) {
                    return true;
                }
            }
            return false;
        } else {
            int index = c - 'a';
            return searchInNode(word, node.children[index], start + 1);
        }
    }
}
