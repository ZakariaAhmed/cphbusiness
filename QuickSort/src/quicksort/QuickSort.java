/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Zack
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Address> allList = new ArrayList<>();
        ArrayList<Address> expList = new ArrayList<>();

        Address value1 = new Address("Abelgaden");
        Address value2 = new Address("Brændholt");
        Address value3 = new Address("Midtermolen");
        Address value4 = new Address("Wertigaden");
        Address value5 = new Address("Zantsgade");         

        allList.add(value1);
        allList.add(value2);
        allList.add(value3);
        allList.add(value4);
        allList.add(value5);
        
        
       
        
        expList.add(value5);
        expList.add(value3);
        expList.add(value2);
        expList.add(value1);
        expList.add(value4);
       
       
         QuickSortClass sortedAdr = new QuickSortClass();
         
         boolean result = true;
         
         for (int i = 0; i < allList.size(); i++) {
             
             System.out.println(sortedAdr.quickSort(expList, 0, expList.size()-1).get(i).street);
             //System.out.println(allList.get(i).street);
          
             //System.out.println(expList.get(i).street+"\n");
          }
         
        
    }
    
}
