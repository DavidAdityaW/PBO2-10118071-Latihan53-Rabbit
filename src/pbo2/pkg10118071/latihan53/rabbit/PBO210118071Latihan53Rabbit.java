/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan53.rabbit;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     rabbit
 * 
 */
public class PBO210118071Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        
        System.out.println("Hello, His name is " + rabbit.getName());
        System.out.println(rabbit.getName() + " is Vegetarian ? " + rabbit.isVegetarian());
        System.out.println(rabbit.getName() + " eats " + rabbit.getEats());
        System.out.println(rabbit.getName() + " has " + rabbit.getNoOfLegs() + " legs");
        System.out.println(rabbit.getName() + " color is " + rabbit.getColor());
    }
    
}
