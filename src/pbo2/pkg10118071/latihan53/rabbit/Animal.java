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
public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;
    
    Animal(boolean vegetarian, String food, int legs) {
        this.vegetarian = vegetarian;
        eats = food;
        noOfLegs = legs;
    }
    
    public boolean isVegetarian() {
        return vegetarian;
    }
    
    public String getEats() {
        return eats;
    }
    
    public int getNoOfLegs() {
        return noOfLegs;
    }
}
