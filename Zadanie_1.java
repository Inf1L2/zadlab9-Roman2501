/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.*;
/**
 *
 * @author Roman
 */
public class Zadanie_1  {
    public static void Zadanie_1(){
       int [] tab;
        tab = new int[100];
        Random rand = new Random();
        System.out.println("100 elementowa tablica z liczbami losowymi (0-100):");
        
        for(int i=0; i<tab.length; i++){
         tab[i] =rand.nextInt(100);   
         System.out.println(i+1 + " element tablicy wynosi = " + tab[i]);
        }
        
        Arrays.sort(tab);
        
        System.out.println("Posortowana tablica : ");
        
         for(int i=0; i<tab.length; i++){
         System.out.println(i+1 + " element tablicy wynosi = " + tab[i]);
        }
}
}
