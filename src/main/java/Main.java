import oop.concurrency.AnotherThread;
import oop.concurrency.MyRunnable;

import static oop.concurrency.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
       /* Integer[] intList = EnterAndSortList.enterList();

        Integer[] sortedList = EnterAndSortList.sortIntegers(intList);

        EnterAndSortList.printList(sortedList);*/

        System.out.println(ANSI_PURPLE + "Hi there");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hi from anonimous");

            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();
        anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again");
    }
}
