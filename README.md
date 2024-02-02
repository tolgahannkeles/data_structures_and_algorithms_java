# COMP203 Data Structures and Algorithms Project 🚀

This project includes Java implementations of various data structures developed as part of the COMP203 Data Structures and Algorithms course. Each data structure has been designed to understand and apply the concepts taught in the course.

## Data Structures 📚

1. **SinglyLinkedList and DoublyLinkedList:** Contains the implementation of a linked list data structure. The `SinglyLinkedList` and `DoublyLinkedList` class includes basic operations such as adding and removing nodes, as well as traversing the list.

2. **BinaryTree:** Encompasses the implementation of a binary tree data structure. The `BinaryTree` class is responsible for operations like inserting and deleting nodes, as well as depth-first and breadth-first traversals.

3. **Queue:** Implements the queue data structure. The `Queue` class includes operations for enqueueing, dequeueing, and checking the status of the queue.

4. **Stack:** Features the implementation of a stack data structure. The `Stack` class includes operations for pushing, popping, and inspecting the stack.

## Usage 🚀

Basic examples of using each data structure:

```java
// Sample usage code
SinglyLinkedList<String> linkedList = new LinkedList<>();
linkedList.addFirst("Element 1");
linkedList.addLast("Element 2");
// ...

BinarySearchTree<Integer> binaryTree = new BinaryTree<>();
BSTNode<Integer> root = binaryTree.insert(null, 10);
binaryTree.insert(root, 5);
// ...

SLLQueue<Double> queue = new SLLQueue<>();
queue.enqueue(3.14);
queue.enqueue(2.71);
// ...

SLLStack<Character> stack = new SLLStack<>();
stack.push('A');
stack.push('B');
// ...
