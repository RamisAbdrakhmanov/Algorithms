package leetcode.queue;

class MyCircularQueue {
    int[] arr;
    int tail;
    int head;
    int size = 0;

    public MyCircularQueue(int k) {
        arr = new int[k];
        tail = 0;
        head = 0;
    }

    public boolean enQueue(int value) {

        if (size != arr.length) {
            size++;
            head = head % arr.length;
            arr[head++] = value;
            return true;
        } else {
            return false;
        }
    }

    public boolean deQueue() {
        if (size != 0) {
            size--;
            tail = tail % arr.length;
            tail++;
            return true;
        } else {
            return false;
        }
    }

    public int Front() {
        return arr[tail];
    }

    public int Rear() {
        return arr[head];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length - 1;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
