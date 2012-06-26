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
    
    @Override
    public void run()
    {
        System.out.println("UpCounter thread started");
    }
    
    public static void main(String args[])
    {
        (new Thread(new UpCounter())).start();
    }
}
