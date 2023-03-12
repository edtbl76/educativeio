package multithreading.threads.threadhandling;

import utils.Generated;

import static java.lang.System.currentTimeMillis;

@Generated
public class LongSleepyExecute implements Runnable {
    @Override
    @SuppressWarnings({"java:S106", "java:S2142"})
    public void run() {
        try {
            System.out.println("innerThread sleeps at " + currentTimeMillis() / 1000);
            Thread.sleep(1_000_000);
        } catch (InterruptedException e) {
            System.out.println("innerThread interrupted at " + currentTimeMillis() / 1000);
        }
    }
}
