/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencytest;

/**
 *
 * @author dean
 */
public class UpCounter implements Runnable {
    private int i = 0;
    
    @Override
    public void run()
    {
        System.out.println("UpCounter thread started");
        
        work();
    }
    
    private void work()
    {
        while (i < 50)
        {
            i++;
            
            System.out.println("UpThread: " + i);
        }
    }
    
    public static void main(String args[])
    {
        (new Thread(new UpCounter())).start();
    }
}
