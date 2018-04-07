package com.corejava.assignments.threading;

class NeedOfThread {

    private int count;

    /*
    Not Synchronized
    Thread T1 sees count as 20 and increment it to 21. At the same time, thread t2 also sees count as 20 and increment
    it to 21. This shows that count became inconsistent.
    This is not proper sharing as there is no sync in threads i.e. no thread safety/thread inconsistency
     */
    public int incrementCount() {
        count++;
        return count;
    }
}

/*
Thread T1 sees count as 20 and increment it to 21. At the same time, thread t2 will now see count as 21 and increment
it to 22.
 */
class ThreadBlockingSyncTypes {
    private int count;

    /*
    Synchronization type 1
    synchronized method
     */
    public synchronized int incrementCountSyncMethod() {
        count++;
        return count;
    }

    /*
    Synchronization type 2
    synchronized block
    */
    public int incrementCountSyncBlock() {
        synchronized (this) {
            count++;
            return count;
        }
    }
}

/*
There are two types of locking in java.

Object level locking
Class level locking

 */
public class ThreadBlockingTypes {

    private static int countStatic;
    private int count;
    private final Object lock = new Object();
    private final static Object staticLock = new Object();

    /*
    Object level locking:
Object level locking means you want to synchronize non static method or block so that it can be accessed by only one thread at a time for that instance. It is used if you want to protect non static data.
You can achieve Object level locking by following.
     */

    //    1. Make method synchronized
    public synchronized int incrementCount() {
        return ++count;
    }

    //    2. Using synchronized block and lock on this:
    public int incrementCountLockedOnThis() {
        synchronized (this) {
            count++;
            return count;
        }
    }

    //    3. Using synchronized block and lock on some other object:
    public int incrementCountLockedOnOtherObject() {
        synchronized (lock) {
            count++;
            return count;
        }
    }

    /*
    Class level locking:
Class level locking means you want to synchronize static method or block so that it can be accessed by only one thread for whole class. If you have 10 instances of class, only one thread will be able to access only one method or block of any one instance at a time. It is used if you want to protect static data.
This can be achieved by following:
     */
//    1. Make static method synchronized:
    public static synchronized int incrementStaticCount() {
        return ++countStatic;
    }

    //2. Using synchronized block and lock on .class:
    public int incrementStaticCountOnThisClass() {
        synchronized (ThreadBlockingTypes.class) {
            count++;
            return count;
        }
    }

    //3. Using synchronized block and lock on some other static object:
    public int incrementStaticCountOnOtherClass() {
        synchronized (staticLock) {
            count++;
            return count;
        }

    }
}