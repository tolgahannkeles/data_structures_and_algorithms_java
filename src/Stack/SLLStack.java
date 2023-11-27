package Stack;

import LinkedLists.SinglyLinkedList;

public class SLLStack<E> {
    private SinglyLinkedList<E> sll;
    public SLLStack(){
        sll= new SinglyLinkedList<>();
    }

    public void push(E element){
        sll.addFirst(element);
    }
    public E pop(){
        return sll.removeFirst();
    }

    public E top(){
        return sll.first();
    }
    public int size(){
        return sll.size();
    }
    public boolean isEmpty(){
        return sll.isEmpty();
    }

    void display(){
        sll.display();
    }
    public static void main(String[] args) {
        SLLStack<Integer> sllStack= new SLLStack<>();
        sllStack.push(1);
        sllStack.push(2);
        sllStack.push(3);
        sllStack.push(4);
        sllStack.display();
        sllStack.pop();
        sllStack.display();
    }
}
