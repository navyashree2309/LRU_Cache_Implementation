# LRU Cache Implementation in Java

## Overview

This project implements an **LRU (Least Recently Used) Cache** using Java. It stores key-value pairs and removes the least recently used item when the cache reaches its capacity.

The implementation combines:

* HashMap for O(1) lookup
* Circular Doubly Linked List for O(1) insertion, deletion, and updates

---

## Features

* O(1) `get()` and `put()` operations
* Automatic eviction of least recently used items
* Efficient cache management
* Custom implementation without `LinkedHashMap`

---

## Technologies Used

* Java
* HashMap
* Circular Doubly Linked List
* Object-Oriented Programming

---

## Input

text
["LRUCache","put","put","get","put","get","put","get","get","get"]

[[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]


---

## Output

text
[null, null, null, 1, null, -1, null, -1, 3, 4]


---

## Time Complexity

| Operation | Complexity |
| --------- | ---------- |
| get()     | O(1)       |
| put()     | O(1)       |

---

## Applications

* Database Caching
* Browser Caching
* Memory Management
* API Response Caching

---

## Conclusion

This project demonstrates an efficient LRU Cache implementation using a HashMap and Circular Doubly Linked List, ensuring constant-time operations while effectively managing limited cache storage.
