package com.company;

import static com.company.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();
//        anotherThread.run();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from anonymous class thread");
            }
        }.start();

//        Thread myRunnableThread = new Thread(new MyRunnable());
        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous implementation of run");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "Another Thread terminated or timed out, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all, I was interrupted");
                }
            }
        });
        myRunnableThread.start();

//        anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from main thread");


    }
}
