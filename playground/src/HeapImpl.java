import java.lang.reflect.Array;
import java.util.Arrays;

class MaxBinaryHeap {
    int[] arr;
    int size;
    int heapSize = 0;

    MaxBinaryHeap(int size) {
        arr = new int[size];
        this.size = size;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return (i * 2) + 1;
    }

    int right(int i) {
        return (i * 2) + 2;
    }

    void insert(int num) {
        heapSize++;
        arr[heapSize - 1] = num;
        swap(arr, 0, heapSize - 1);
        heapify(0);
    }

    void heapify(int i) {
        int largest = i;
        int lChild = left(i);
        int rChild = right(i);
        if (lChild < heapSize && arr[lChild] > arr[largest]) {
            largest = lChild;
        }
        if (rChild < heapSize && arr[rChild] > arr[largest]) {
            largest = rChild;
        }
        if (i != largest) {
            swap(arr, i, largest);
            heapify(largest);
        }
    }

    int extractMax() {
        int maxi = arr[0];
        swap(arr, 0, heapSize - 1);
        heapSize--;
        heapify(0);
        return maxi;
    }

    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


public class HeapImpl {
    public static void main(String[] args) {
        MaxBinaryHeap maxHeap = new MaxBinaryHeap(10);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(30);
        System.out.println(Arrays.toString(maxHeap.arr));
        System.out.println(maxHeap.extractMax());
        System.out.println(Arrays.toString(maxHeap.arr));
        maxHeap.insert(14);
        System.out.println(Arrays.toString(maxHeap.arr));
        System.out.println(maxHeap.extractMax());
        System.out.println(maxHeap.extractMax());
    }
}
