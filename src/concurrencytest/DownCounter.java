/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencytest;

/**
 *
 * @author dean
 */
public class DownCounter extends Thread {
    
    @Override
    public void run()
    {
        System.out.println("DownCounter thread started");
    }
    
    public static void main(String args[])
    {
        (new DownCounter()).start();
    }
}
