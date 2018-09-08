/*
 * Emily Jetton
 * Sept 8, 2018
 * 
 * Please put your name, date, and brief description of this class here.
 */
package src.edu.frostburg.cosc310.lab00;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Your documentation should begin here.
 * @author SteveK
 */
public class JettonEmilyLab00 implements Lab00 {

    /**
     * Makes a long string using Java concatenation.
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem0(int size) {
        System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i;
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * Makes a long string using Java StringBuilder
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            sb.append(i);
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    @Override
    public long problem2() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<String> myList = new ArrayList<String>();
        List<String> myList2 = new LinkedList<String>();
        int size = 10000;
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) 
        {
            String s = Integer.toString(i);
            myList.add(s);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList time"+ (end-start));
        
        long start2 = System.currentTimeMillis();
        for (int i=0; i<size; i++) 
        {
            String s = Integer.toString(i);
            myList2.add(s);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("LinkedList time"+(end2-start2));
        
        if((end2-start2)>(end-start))
        {
          return (end-start);  
        }
        else
            return (end2-start2);
        
    }
    
}
