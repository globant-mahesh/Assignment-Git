package com.corejava.assignments.lambda;

public class ThreadInstantiation {

    public static void main(String[] args) {
        Thread threadWithoutLambda = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running the thread");
            }
        });

        Thread threadWithLambda = new Thread(()->{
            System.out.println("Running lambda thread");
        });

        threadWithoutLambda.start();
        threadWithLambda.start();
    }
}
