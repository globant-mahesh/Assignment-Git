package com.corejava.assignments.designpatterns;

/**
 * Despite this class being thread-safe, we can see that there’s a clear performance drawback: each time we want to get
 * the instance of our singleton, we need to acquire a potentially unnecessary lock.
 */
class DraconianSingleton {
    private static DraconianSingleton instance;
    public static synchronized DraconianSingleton getInstance() {
        if (instance == null) {
            instance = new DraconianSingleton();
        }
        return instance;
    }

    // private constructor and other methods ...
}

/**
 * To fix above issue, we could instead start by verifying if we need to create the object in the first place and only
 * in that case we would acquire the lock.(Double checked lock)
 *
 * we want to perform the same check again as soon as we enter the synchronized block, in order to keep the operation
 * atomic.
 *
 * With this pattern as shown in below example, the field needs to be volatile to prevent cache incoherence issues.
 * In fact, the Java memory model allows the publication of partially initialized objects and this may lead in turn to
 * subtle bugs.
 *
 * it has at least two issues:
 *
 * 1. Since it requires the volatile keyword to work properly, it’s not compatible with Java 1.4 and lower versions
 * 2. it’s quite verbose and it makes the code difficult to read
 */
class DclSingleton {
    private static volatile DclSingleton instance;
    public static DclSingleton getInstance() {
        if (instance == null) {
            synchronized (DclSingleton .class) {
                if (instance == null) {
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }

    // private constructor and other methods...
}

/**
 * Alternatives
 *
 * All of the following methods delegate the synchronization task to the JVM.
 *
 * 1. Early Initialization
 *
 * The easiest way to achieve thread safety is to inline the object creation or to use an equivalent static block.
 * This takes advantage of the fact that static fields and blocks are initialized one after another.
 *
 * Java Language Specification reference link: https://docs.oracle.com/javase/specs/jls/se7/html/jls-12.html#jls-12.4.2
 *
 * 2. Lazy initialization OR Initialization on Demand
 * since we know from the Java Language Specification reference in the previous paragraph that a class initialization
 * occurs the first time we use one of its methods or fields, we can use a nested static class to implement lazy
 * initialization
 *
 * In this case, the InstanceHolder class will assign the field the first time we access it by invoking getInstance.
 *
 * 3. Enum Singleton
 */
public class DoubleCheckedEarlyInitLockingSingleton {
    private final static DoubleCheckedEarlyInitLockingSingleton INSTANCE = new DoubleCheckedEarlyInitLockingSingleton();
    public static DoubleCheckedEarlyInitLockingSingleton getInstance() {
        return INSTANCE;
    }

    private DoubleCheckedEarlyInitLockingSingleton() {
    }
}
class InitOnDemandSingleton {
    private static class InstanceHolder {
        private static final InitOnDemandSingleton INSTANCE = new InitOnDemandSingleton();
    }
    public static InitOnDemandSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }
    // private constructor and other methods...
}

/**
 * This is considered to be the most concise and safe way to write a singleton:
 */
enum EnumDoubleCheckedSingleton {
    INSTANCE;

    // other methods...
}