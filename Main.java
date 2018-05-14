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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a;
        Scanner s = new Scanner(System.in);
        System.out.println("wybież 1 lub 2");
        a = s.nextInt();
        switch (a)
        {
            case 1:
                Zadanie_1.Zadanie_1();
                break;
            case 2:
                Zadanie_2.Zadanie_2();
                break;
           
            default:
                System.out.println("Invalid exercise number! Beginning shutdown sequence...");
                break;
        }
    }
    
}
