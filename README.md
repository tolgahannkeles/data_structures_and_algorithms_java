# COMP203 Data Structures and Algorithms Project

This project includes Java implementations of various data structures developed as part of the COMP203 Data Structures and Algorithms course. Each data structure has been designed to understand and apply the concepts taught in the course.

## Data Structures

1. **LinkedList:** Contains the implementation of a linked list data structure. The `LinkedList` class includes basic operations such as adding and removing nodes, as well as traversing the list.

2. **BinaryTree:** Encompasses the implementation of a binary tree data structure. The `BinaryTree` class is responsible for operations like inserting and deleting nodes, as well as depth-first and breadth-first traversals.

3. **Queue:** Implements the queue data structure. The `Queue` class includes operations for enqueueing, dequeueing, and checking the status of the queue.

4. **Stack:** Features the implementation of a stack data structure. The `Stack` class includes operations for pushing, popping, and inspecting the stack.

## Usage

Basic examples of using each data structure:

```java
// Sample usage code
LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("Element 1");
linkedList.add("Element 2");
// ...

BinaryTree<Integer> binaryTree = new BinaryTree<>();
binaryTree.insert(10);
binaryTree.insert(5);
// ...

Queue<Double> queue = new Queue<>();
queue.enqueue(3.14);
queue.enqueue(2.71);
// ...

Stack<Character> stack = new Stack<>();
stack.push('A');
stack.push('B');
// ...
