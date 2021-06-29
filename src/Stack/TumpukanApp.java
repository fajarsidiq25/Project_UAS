/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Fajar Sidiq
 */
public class TumpukanApp {
     public static void main(String[] args) {
    Tumpukan tumpukan = new Tumpukan(10);
    tumpukan.push(54);
    tumpukan.baca();
    tumpukan.push(30);
    tumpukan.baca();
    long nilai1=tumpukan.pop();
    System.out.println("Nilai Teratas = "+nilai1);
    System.out.println("Nama Saya Adalah Fajar Sidiq");
    System.out.println("Nialai yang dihapus"+nilai1);
    tumpukan.baca();
    System.out.println("\n");
    tumpukan.push(40);
    tumpukan.baca();
    tumpukan.push(50);
    tumpukan.baca();  
    }
}
