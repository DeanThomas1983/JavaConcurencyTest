/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencytest;

/*
 * @author dean
 */
public class ConcurrencyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thread upThread = new Thread(new UpCounter());
        Thread downThread = new Thread(new DownCounter());
        
        upThread.start();
        downThread.start();
        
        while(upThread.isAlive() || downThread.isAlive())
        {
            
        }
        
        System.out.println("Execution finished");
    }
}
