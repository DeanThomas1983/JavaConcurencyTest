/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencytest;

/**
 *
 * @author dean
 */
public class DownCounter implements Runnable {
    int i;
    
    @Override
    public void run()
    {
        System.out.println("DownCounter thread started");
        
        i = 50;
        
        work();
    }
    
    private void work()
    {
        while (i > 0)
        {
            i--;
            
            System.out.println("DownThread: " + i);
        }
    }
    
    public static void main(String args[])
    {
        (new Thread(new DownCounter())).start();
    }
}
