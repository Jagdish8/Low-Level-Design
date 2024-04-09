import java.util.HashMap;

public class MyHashMap<K, V> {

    private int initialSize = 16;
    private int maxCapacity = 1000;
    private Node[] hashTable;

    public MyHashMap() {
        hashTable = new Node[initialSize];
    }

    public MyHashMap(int capacity) {
        hashTable = new Node[capacity];
    }

    public void put(K key, V value) {
        int hashCode = key.hashCode()%hashTable.length;
        Node entry = hashTable[hashCode];
        if(entry == null) {
            Node newEntry = new Node(key, value);
            hashTable[hashCode] = newEntry;
        } else {
            Node prev = entry;
            while(entry != null) {
                if(entry.key == key) {
                    entry.value = value;
                    return;
                }
                prev = entry;
                entry = entry.next;
            }
            Node newEntry = new Node(key, value);
            prev.next = newEntry;
        }
    }

    public V get(K key) {
        int hashCode = key.hashCode() % hashTable.length;
        Node entry = hashTable[hashCode];

        while(entry != null) {
            if(entry.key.equals(key)) {
                return (V) entry.value;
            }
            entry = entry.next;
        }
        return null;
    }

    private class Node<K, V> {
        K key;
        V value;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
