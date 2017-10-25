/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronization;

/**
 *
 * @author Santosh
 */
public class Display {

    public synchronized void m1(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Current Indian cricket captian is " + name + " with positions " + i);
            //  System.out.println(name);
        }

    }
}

class Mythread extends Thread {

    Display d;
    String name;

    public Mythread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {

        d.m1(name);
    }

    public static void main(String[] args) {

        Display d = new Display();

        Mythread t1 = new Mythread(d, "Dhoni");
        Mythread t2 = new Mythread(d, "Kohli");
        t2.start();
        t1.start();
        

    }

}
