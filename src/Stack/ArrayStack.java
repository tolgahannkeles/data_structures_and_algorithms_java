package Stack;

import java.util.EmptyStackException;

public class ArrayStack<E> {

    private E[] array;
    private int top = -1;
    private int size=0;

    public ArrayStack(int capacity) {
        array = (E[]) new Object[capacity];
    }

    public void push(E element) {
        if (size == array.length) throw new RuntimeException("Stack is full.");
        else {
            top = top + 1;
            array[top] = element;
            size++;
        }
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E temp = array[top];
        array[top] = null;
        top = top - 1;
        size--;
        return temp;
    }

    public E top(){return array[top];}
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        String str = "";
        for (int i=0;i<array.length;i++) {
            str += ((array[i] == null) ? "Null" : array[i].toString()) + ((i==array.length-1) ?"": " -> ");
        }
        System.out.println(str);
    }


    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Pushed elements: ");
        stack.display();
        stack.pop();
        stack.pop();
        System.out.println("Elements after pop: ");
        stack.display();
    }
}
