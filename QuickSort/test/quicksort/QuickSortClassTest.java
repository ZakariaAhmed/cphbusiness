/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zack
 */
public class QuickSortClassTest {
    
    public QuickSortClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * tester for 0 elementer
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        ArrayList<Address> a = null;
        int startværdi = 0;
        int slutværdi = 0;
        QuickSortClass instance = new QuickSortClass();
        ArrayList<Address> expResult = null;
        ArrayList<Address> result = instance.quickSort(a, startværdi, slutværdi);
        assertEquals(expResult, result);
    }
    
    // tester for 5 elementer
    @Test
    public void testQuickSort5(){
        System.out.println("Tester 5 elementer");
        ArrayList<Address> allList = new ArrayList<>();
        ArrayList<Address> expList = new ArrayList<>();
        QuickSortClass qs = new QuickSortClass();
        Address value1 = new Address("Abelgaden");
        Address value2 = new Address("Brandholt");
        Address value3 = new Address("Midtermolen");
        Address value4 = new Address("Orbak");
        Address value5 = new Address("Wertigaden");
        
        // vi har sat dem ind random her
        allList.add(value2);
        allList.add(value4);
        allList.add(value1);
        allList.add(value3);
        allList.add(value5);
        
        // hvis sorteret så skulle de blive sat sådan her ind.
        expList.add(value1);
        expList.add(value2);
        expList.add(value3);
        expList.add(value4);
        expList.add(value5);
        
        qs.quickSort(allList, 0, allList.size()-1);
        
        
        
        assertEquals(allList, expList);
         
    }
    
    // tester 10 elementer
    //@Test
    
}
