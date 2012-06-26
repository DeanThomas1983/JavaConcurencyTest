/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencytest;

/**
 *
 * @author dean
 */
public class UpCounter extends Thread {
    
    @Override
    public void run()
    {
        System.out.println("UpCounter thread started");
    }
    
    public static void main(String args[])
    {
        (new UpCounter()).start();
    }
}
