package com.corejava.assignments.collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Stack implementation from Queues
 * <p>
 * push(s, x) // x is the element to be pushed and s is stack
 * pop(s)
 * 1) Dequeue an item from q1 and return it.
 *
 *Remove function in queue has access to the most recent item added to queue(front)
 * use it to reverse the order of entire queue size
 */
public class Stack {
    //    This queue will act as stack and assumed to be in Stack order in the beginning
    static Queue q1 = new LinkedList<Integer>();
    static int size = 0;

    public Stack() {
        size = 0;
    }

    public static void push(int value) {
        size++;
        q1.add(value);
        //To change the order FIFO(Queue) to LIFO(Stack)
        for (int i = 0; i < q1.size() - 1; i++) {
            q1.add(q1.remove());
        }
    }

    public static void pop() {
        if (q1.isEmpty()) {
            return;
        } else {
            q1.remove();
            size--;
        }
    }

    public static Object top() {
        if (q1.isEmpty()) {
            return -1;
        } else {
            return q1.peek();
        }
    }

    public static int size() {
        return size;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        System.out.println("current size: " + s.size());
    }
}
