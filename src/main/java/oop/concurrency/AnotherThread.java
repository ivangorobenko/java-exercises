package oop.concurrency;

import static oop.concurrency.ThreadColor.ANSI_BLUE;
import static oop.concurrency.ThreadColor.ANSI_PURPLE;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hi from another thread");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(ANSI_BLUE + "Another thread woke uo");
            return;
        }
        System.out.println(ANSI_BLUE + "Three secondes have passed I'm awake");
    }
}
