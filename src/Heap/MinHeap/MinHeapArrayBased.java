import java.util.ArrayList;

public class MinHeapArrayBased<T extends Comparable<T>> {
    ArrayList<T> array = new ArrayList<>();

    public MinHeapArrayBased() {
    }

    public int parent(int index) {
        return (index - 1) / 2;
    }

    public int left(int index) {
        return 2 * index + 1;
    }

    public int right(int index) {
        return 2 * index + 2;
    }

    public boolean hasLeft(int index) {
        return left(index) < array.size();
    }

    public boolean hasRight(int index) {
        return right(index) < array.size();
    }

    public boolean hasParent(int index) {
        return parent(index) >= 0;
    }


    public void add(T data) {
        array.add(data);
        heapifyUp();
    }


    public void removeMin() {
        swap(0, array.size() - 1);
        array.removeLast();
        heapifyDown();
    }

    public void heapifyUp() {
        int index = array.size()-1;
        while (hasParent(index) && (array.get(parent(index)).compareTo(array.get(index)) > 0)) {
            swap(parent(index),index);
            index=parent(index);
        }
    }

    public void heapifyDown() {
        int index= 0;
        while (hasLeft(index)){

            int smallest= left(index);
            if(hasRight(index) && (array.get(left(index)).compareTo(array.get(right(index))) >0 )){
                smallest= right(index);
            }
            if(array.get(smallest).compareTo(array.get(index))>0) break;
            else swap(smallest,index);

            index=smallest;

        }
    }

    public void swap(int i, int j) {
        T temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

    public void display() {
        int n = array.size();
        int depth = (int) (Math.log(n) / Math.log(2));

        int currentIndex = 0;
        for (int i = 0; i <= depth; i++) {
            int elementsInLevel = (int) Math.pow(2, i);

            for (int j = 0; j < elementsInLevel && currentIndex < n; j++) {
                T value = array.get(currentIndex);
                T parentValue = (currentIndex - 1) / 2 >= 0 ? array.get((currentIndex - 1) / 2) : null;

                System.out.print("(" + parentValue + ") " + value + " ");

                currentIndex++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        MinHeapArrayBased<Integer> minHeap = new MinHeapArrayBased<>();
        minHeap.add(4);
        minHeap.add(2);
        minHeap.add(6);
        minHeap.add(3);
        minHeap.add(5);
        minHeap.add(0);
        minHeap.add(1);

        minHeap.display();
    }

}
