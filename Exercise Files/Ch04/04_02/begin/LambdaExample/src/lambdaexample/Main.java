
package lambdaexample;


/**
 *
 * @author bethan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("Bethan");
        // lambda expression example
            GreetingMessage gm2 = (String name) ->{
                System.out.println("Hello Yo "+ name);
            };
        gm2.greet("Gourav");
        MessagePrinter mp = () ->{
            System.out.println("This is a message!");
        };
        mp.printMessage();
        
    }
    
}