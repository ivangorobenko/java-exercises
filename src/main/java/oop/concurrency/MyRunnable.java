package oop.concurrency;

import static oop.concurrency.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from myRunnable");
    }
}
