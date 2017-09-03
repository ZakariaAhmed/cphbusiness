/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.ArrayList;

/**
 *
 * @author Zack
 */
public class QuickSortClass {

    public QuickSortClass() {
    }
      
    public ArrayList<Address> quickSort(ArrayList<Address> a, int startværdi, int slutværdi)
{
        // i vil scanne fra venstre til højre
        int i = startværdi;
        // og j vil scanne fra højre til venstre.
        int j = slutværdi;

        // vi sikrer os at vi kun sorter efter der er 2 eller flere elementer i vores array
        if (j - i >= 1)
        {
            
            // Vi sætter vores pivot til første element i arrayet.
            String pivot = a.get(i).street;
            
            // Her sørger vi for at kun scanne mellem de to værdier indtil de møder hinanden
            while (j > i)
            {
                // her sammenligner vi fra venstre, vores første element i arrayet med pivot
                // med compareTo metoden, som gøre at den leksigrafisk sammenligner de to strings 
                // positiv resultat hvis første string er leksigrafisk større end pivot
                
                // vores sammenligning: hvis første element, sammenlignet med pivot er mindre eller ligmed 0 og
                // i er større end vores slutværdi, og j er mindre end i.
                
                while (a.get(i).street.compareTo(pivot)  <= 0 && i < slutværdi && j > i){
                    i++;
                }
                
                // vice versa, gøre det fra højre side.
                while (a.get(j).street.compareTo(pivot) >= 0 && j > startværdi && j >= i){
                    j--;
                }
                
                // checker de to elementer i midten, det er sidste sammenligning før venstre og højre krydser hinanden
                if (j > i)
                    swap(a, i, j);
            }
           
            // på det her tidspunkt har vi delt dem i højre og venstre gruppe, 
            // men selve grupperne er ikke sorteret dem selv.
            
            // her swapper vi vores pivot point med sidste element af vores venstre gruppe
            swap(a, startværdi, j);
          
            // sortering af venstre gruppe, via en rekursiv kode som kalder eget metode
            quickSort(a, startværdi, j - 1);
            // sortering af højre gruppe samme her
            quickSort(a, j + 1, slutværdi);
        }
        
        
        // tilsidst returner vi vores array, sorteret :-)
         return a;
    }
////     // vores private funktion som swapper to elementer
     
    private static void swap(ArrayList<Address> a, int i, int j)
            {
            Address temp = a.get(i);
            a.set(i,a.get(j));
            a.set(j, temp);
            }

}
