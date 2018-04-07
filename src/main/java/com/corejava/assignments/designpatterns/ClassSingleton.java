package com.corejava.assignments.designpatterns;

/**
 * The most popular approach is to implement a Singleton by creating a regular class and making sure it has:
 *
 * Aautowiring private constructor
 * Aautowiring static field containing its only instance
 * Aautowiring static factory method for obtaining the instance
 * We’ll also add an info property, for later usage only. So, our implementation will look like this:
 */
public final class ClassSingleton {
    private static ClassSingleton INSTANCE;
    private String info = "Initial info class";

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }

        return INSTANCE;
    }
    // getters and setters
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static void main(String[] args) {
        ClassSingleton classSingleton1 = ClassSingleton.getInstance();

        System.out.println(classSingleton1.getInfo()); //Initial class info

        ClassSingleton classSingleton2 = ClassSingleton.getInstance();
        classSingleton2.setInfo("New class info");

        System.out.println(classSingleton1.getInfo()); //New class info
        System.out.println(classSingleton2.getInfo()); //New class info


        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();

        System.out.println(enumSingleton1.getInfo()); //Initial enum info

        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton2.setInfo("New enum info");

        System.out.println(enumSingleton1.getInfo()); // New enum info
        System.out.println(enumSingleton2.getInfo()); // New enum info
    }
}

/*
While this is a common approach, it’s important to note that it can be problematic in multithreading scenarios, which
is the main reason for using Singletons.

Simply put, it can result in more than one instance, breaking the pattern’s core principle. Although there are locking
solutions to this problem, our next approach solves these problems at a root level.
 */

enum EnumSingleton {

    INSTANCE("Initial class info");

    private String info;
    //Aautowiring private constructor
    private EnumSingleton(String info) {
        this.info = info;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    // getters and setters

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

//This approach has serialization and thread-safety guaranteed by the enum implementation itself, which ensures
// internally that only the single instance is available, correcting the problems pointed out in the class-based
// implementation.


/*
We distinguish two types of issues with singletons:

1. existential (do we need a singleton?)
2. implementational (do we implement it properly?)
 */

/*
1. Existential
Conceptually, a singleton is a kind of global variable. In general, we know that global variables should be avoided —
especially if their states(fields) are mutable(once instance of the object is created we can change its field value
by setter or other methods).

For example, singletons are often used to encompass the application’s configuration data (i.e., connection to the
repository). If they are used as global objects, it becomes difficult to choose the configuration for the test
environment.

Therefore, when we run the tests, the production database gets spoiled with the test data, which is hardly acceptable.

If we need a singleton, we might consider the possibility of delegating its instantiation to another class — a sort of
factory — that should take care of assuring that there is just one instance of the singleton in play.
*/

/*
2. Implementational Issues

 Synchronization
The implementation with a private constructor that we presented above is not thread-safe: it works well in a
single-threaded environment, but in a multi-threaded one, we should use the synchronization technique to guarantee
the atomicity of the operation:


public synchronized static ClassSingleton getInstance() {
    if (INSTANCE == null) {
        INSTANCE = new ClassSingleton();
    }
    return INSTANCE;
}

In absence of synchronization, there is a possibility that two threads interleave their executions in such a way that
the expression INSTANCE == null evaluates to true for both threads and, as a result, two instances of ClassSingleton
get created.

Synchronization might significantly affect the performance. If this code gets invoked often, we should speed it up
using various techniques like lazy initialization or double-checked locking
 */