// Last updated: 8/5/2026, 9:06:03 PM
1class MyCircularQueue {
2
3    private int[] queue;
4    private int front;
5    private int rear;
6    private int size;
7    private int capacity;
8
9    public MyCircularQueue(int k) {
10        capacity = k;
11        queue = new int[k];
12        front = 0;
13        rear = 0;
14        size = 0;
15    }
16
17    public boolean enQueue(int value) {
18        if (isFull()) {
19            return false;
20        }
21
22        queue[rear] = value;
23        rear = (rear + 1) % capacity;
24        size++;
25        return true;
26    }
27
28    public boolean deQueue() {
29        if (isEmpty()) {
30            return false;
31        }
32
33        front = (front + 1) % capacity;
34        size--;
35        return true;
36    }
37
38    public int Front() {
39        if (isEmpty()) {
40            return -1;
41        }
42
43        return queue[front];
44    }
45
46    public int Rear() {
47        if (isEmpty()) {
48            return -1;
49        }
50
51        return queue[(rear - 1 + capacity) % capacity];
52    }
53
54    public boolean isEmpty() {
55        return size == 0;
56    }
57
58    public boolean isFull() {
59        return size == capacity;
60    }
61}