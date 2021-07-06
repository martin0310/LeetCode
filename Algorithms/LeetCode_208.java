class Trie {

    class TrieNode{
        TrieNode [] trieNode;
        boolean isWord;
        //String word;
        
        public TrieNode(){
            trieNode = new TrieNode[26];
            isWord = false;
            //word = "";
        }
            
        
    }
    /** Initialize your data structure here. */
    
    public TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(int i = 0; i < word.length();i++){
            int index = word.charAt(i) - 'a';
            if(node.trieNode[index] == null)
                node.trieNode[index] = new TrieNode();
            node = node.trieNode[index];
        }
        node.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for(int i = 0;i<word.length();i++){
            int index = word.charAt(i) - 'a';
            if(node.trieNode[index] == null) return false;
            node = node.trieNode[index];    
        }
        
        return node.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(int i = 0;i<prefix.length();i++){
            int index = prefix.charAt(i) - 'a';
            if(node.trieNode[index] == null) return false;
            node = node.trieNode[index];
        }
        
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
