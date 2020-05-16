public class PriorityQueue<Key extends Comparable<Key>> {
    private int capacity;
    private int pointer = 0;
    private Key[] inputArray;

    public PriorityQueue(int queueCapacity) {
        this.capacity = queueCapacity;
        inputArray = (Key[]) new Comparable[queueCapacity + 1];
    }

    public void insertElement(Key inputItem) {
        inputArray[++pointer] = inputItem;
        swim(pointer);

    }

    public Key deleteElement(){
        Key max = inputArray[1];
        exchange(1, pointer--);
        sink(1);
        inputArray[pointer + 1] = null;
        return max;
    }

    private void sink(int k) {

        while (2 * k <= pointer) {
            int j = 2*k;
            if (j < pointer && less(j,  j + 1)) j++;
            if(!less(k, j)) break;
            exchange(k, j);
            k = j;
        }
    }
    private void swim(int k) {
            while (k > 1 && less(k / 2, k)) {
                exchange(k/2, k);
                k = k/2;
            }
    }


    private boolean less(int i, int j) {
        return inputArray[j].compareTo(inputArray[i]) > 0;
    }

    private void exchange(int i, int j) {
        Key swap = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = swap;
    }


}
