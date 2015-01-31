
package com.classnested;

import java.util.Iterator;

public class DataStructure2 {
    
    private final static int SIZE = 15;
    private int [] arrayOfInts = new int[SIZE];

    public DataStructure2() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public void printEvent() {
        DataStructureIterator2 dsi = this.new EventIterator();
        while(dsi.hasNext()) {
            System.out.print(dsi.next() + " ");
        }
        System.out.println("");
    }
    
    interface DataStructureIterator2 extends Iterator<Integer> { }
    
    private class EventIterator implements DataStructureIterator2 {
        private int nextInt = 0;
        @Override
        public boolean hasNext() {
            return (nextInt <= SIZE - 1);
        }
        @Override
        public Integer next() {
            Integer nextVal = 
                    Integer.valueOf(arrayOfInts[nextInt]);
            nextInt += 2;
            return nextVal;
        }
        @Override
        public void remove() {
        }
        
    }
    
    public static void main(String[] args) {
        DataStructure2 ds2 = new DataStructure2();
        ds2.printEvent();
    }
    
}
