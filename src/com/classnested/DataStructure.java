
package com.classnested;

import java.util.Iterator;

public class DataStructure {
    
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int [SIZE];

    public DataStructure() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public void printEven() {
        DataStructureIterator iterator = this.new EventIterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("");
    }
    
    interface DataStructureIterator extends Iterator<Integer>{}
    
    private class EventIterator implements DataStructureIterator{
        
        private int nextIndex = 0;
        @Override
        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }

        @Override
        public Integer next() {
            Integer retValue = 
                    Integer.valueOf(arrayOfInts[nextIndex]);
            nextIndex += 2;
            return retValue;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
    
}
