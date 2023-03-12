package multithreading.threads.runnables;

import utils.Generated;

/*
    Same as RunnableDemo,
    but instead of using an anonymous class, we are
    creating a separate class that implements the Runnable interface.
 */
@Generated
public class RunnableDemo2 {

    public static void main(String[] args) {
        ExecuteMe executeMe = new ExecuteMe();
        Thread thread = new Thread(executeMe);
        thread.start();
    }

}

@Generated
@SuppressWarnings("java:S106")
class ExecuteMe implements Runnable {
    public void run() {
        System.out.println("Hello, thread!");
    }
}
