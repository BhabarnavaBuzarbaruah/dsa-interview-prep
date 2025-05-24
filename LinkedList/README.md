# 📚 Linked List Implementation in Java

This repository contains a simple implementation of a **Singly Linked List** in Java. It covers the fundamental operations such as adding, removing, and printing nodes in the list. The list also tracks its size dynamically.

## 🚀 Features

- Add a node to the beginning (`addFirst`)
- Add a node to the end (`addLast`)
- Add a node at a specific index (`add`)
- Remove the first node (`removeFirst`)
- Remove the last node (`removeLast`)
- Print the entire list (`printList`)
- Tracks the current size of the LinkedList

## 🧠 Code Overview

```java
public class LinkedList {
    public static class NODE {
        int data;
        NODE next;
        ...
    }

    public static NODE Head;
    public static NODE Tail;
    public static int size;

    public void addFirst(int data) { ... }
    public void addLast(int data) { ... }
    public void add(int index, int data) { ... }
    public void removeFirst() { ... }
    public void removeLast() { ... }
    public void printList() { ... }
}
