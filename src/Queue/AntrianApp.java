/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Fajar Sidiq
 */
public class AntrianApp {
    public static void main(String[] args){
       Antrian antrian = new Antrian(10);
        antrian.enqueue(54);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        long nilai1 = antrian.peek();
        System.out.println("nilai yang paling depan = "+nilai1);
        System.out.println("Nama saya adalah Fajar Sidiq");
        System.out.println("\n");
        antrian.enqueue(70);
        antrian.display();
        long nilai3 = antrian.dequeue();
        System.out.println("yang diambil dari antrian = "+nilai3);
        antrian.display();
        long nilai4 = antrian.peek();
        System.out.println("nilai yang paling depan = "+nilai4);
        
    }
}
    

