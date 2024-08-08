
package runnable_interface;

/**
 *
 * @author bethan
 */
public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExample());
        thread1.start();
    }

}
