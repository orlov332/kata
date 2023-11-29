package leetcode.QueueStack.MovingAverageFromDataStream;

class MovingAverage {

    private final int[] queue;
    private int pointer = 0;
    private int size = 0;
    private final int capacity;
    private long sum = 0;

    public MovingAverage(int size) {
        capacity = size;
        queue = new int[capacity];
    }

    public double next(int val) {
        sum += val;
        sum -= queue[pointer];
        queue[pointer] = val;
        pointer = (pointer + 1) % capacity;
        if (size < capacity) size++;
        return (double) sum / size;
    }

}
