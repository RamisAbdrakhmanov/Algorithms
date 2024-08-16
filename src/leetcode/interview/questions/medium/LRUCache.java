/*
package litcode.interview.questions.medium;

import java.util.HashMap;

public class LRUCache {
    HashMap<Integer, Integer> map;
    Node start;
    Node end;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        start = new Node(-1);
        end = new Node(-1);
        start.next = end;
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        if (map.size() == capacity){
            start = start.next;
            map.remove(start.key);

        }
        map.put(key, value);
        end.key = key;
        end.next = new Node(-1);
        end = end.next;
    }
}

class Node {
    int key;
    Node next;

    public Node(int key) {
        this.key = key;
    }
}

*/
