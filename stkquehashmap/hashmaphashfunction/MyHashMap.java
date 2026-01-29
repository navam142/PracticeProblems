package stkquehashmap.hashmaphashfunction;

import java.util.*;

public class MyHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private Node<K, V>[] buckets;
    private int size;

    // Constructor
    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    // Hash function
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    // PUT
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        Node<K, V> head = buckets[index];

        // Check if key exists
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value; // update
                return;
            }
            head = head.next;
        }

        // Insert at head
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    // GET
    public V get(K key) {
        int index = getBucketIndex(key);
        Node<K, V> head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    // REMOVE
    public V remove(K key) {
        int index = getBucketIndex(key);
        Node<K, V> head = buckets[index];
        Node<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev != null) {
                    prev.next = head.next;
                } else {
                    buckets[index] = head.next;
                }
                size--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

    // CONTAINS
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public int size() {
        return size;
    }

    // Node class
    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("A", 10);

        System.out.println(map.get("A")); // 10
        System.out.println(map.containsKey("B")); // true

        map.remove("B");
        System.out.println(map.get("B")); // null
    }
}

