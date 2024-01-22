import java.util.Comparator;
import java.util.PriorityQueue;

public class MinHeapWithPriorityQueue <K extends Comparable<K>,V>{
    private PriorityQueue<Entry<K,V>> heap;
    public MinHeapWithPriorityQueue(){
        heap= new PriorityQueue<>(Comparator.comparing(kvEntry -> kvEntry.key));
    }

    public void add(K key, V value){
        heap.offer(new Entry<>(key,value));
    }
    public Entry<K,V> remove(){
        if(heap.isEmpty()) return null;
        return heap.poll();
    }
}

class Entry<K extends Comparable<K>,V>{
    K key;
    V value;
    public Entry(K key, V value){
        this.key=key;
        this.value=value;
    }
}
