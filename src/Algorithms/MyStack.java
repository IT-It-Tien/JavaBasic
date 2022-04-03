package Algorithms;

import java.util.ArrayList;

/**
 * Created by Dell on 4/2/2022.
 */
public class MyStack {
    private ArrayList<Integer> arr = new ArrayList<Integer>();

    /**
     * Insert value into stack
     */
    public void push(int value) {
        arr.add(value);
    }

    /**
     * Take and remove value from stack
     */
    public int pop() {
        if (arr.size() <= 0) return 0;
        return arr.remove(arr.size());
    }

    public String toString() {
        if (arr.size() != 0) {
            for (int i = arr.size() - 1; i >= 0; i--) {
                return String.valueOf(arr.get(i));
            }
        }
        return String.valueOf(0);
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.pop(); // return 0 = default
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.pop();
        stack.pop();
        stack.push(9);
        System.out.println(stack.toString());
//      Stack is empty
//      7
//      5
//      3 9
        /*
        MyQueue queue = new MyQueue();
        queue.dequeue(); // return 0 = default
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(9);
        System.out.println(queue.toString());
//      Queue is empty
//      3
//      5
//      7 9
*/
    }
}

class MyQueue {



    /**
     * Insert value into queue
     */
    public void enqueue(int value) {

    }

    /**
     * Take and remove value from queue
     */
    public int dequeue() {
        return 0;
    }

    public String toString(){
        return "print stack here";
    }
}