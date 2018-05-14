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
public class Zadanie_2 {
     public static void Zadanie_2(){
      Random rand = new Random();
        TreeSet<Integer> Treerand = new TreeSet<>();
        for(int i=0;i<100;i++)
        {
            Treerand.add(rand.nextInt(100));
        }

        Iterator tree = Treerand.iterator();

        while(tree.hasNext())
        {
            Integer value = (Integer)tree.next();
            System.out.println("Wartość losowa : "+value);
        }     
}
}
