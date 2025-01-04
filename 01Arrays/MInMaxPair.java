

public class MInMaxPair {

    public Pair<Integer, Integer> getMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]< min) min = arr[i];
            if(arr[i]> max) max = arr[i];
        }
        
        Pair<Integer, Integer> pair = new Pair(min, max);
        return pair;
    }
    
}


class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}